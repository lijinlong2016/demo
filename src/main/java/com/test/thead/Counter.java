package com.test.thead;

import com.test.thead.entity.Student;
import com.test.thead.testClass.NotThreadSafe;
import org.junit.Test;

/**
 * @Author: lijl
 * @Description: 1、竞态条件与临界区
 * 2、线程安全与共享资源
 *
 *
 * 线程控制逃逸规则：
 * 1、如果一个资源的创建，使用，销毁都在同一个线程内完成，且永远不会脱离该线程的控制，则该资源的使用就是线程安全的。
 * （资源可以是对象，数组，文件，数据库连接，套接字等等。Java中你无需主动销毁对象，所以“销毁”指不再有引用指向对象。）
 * 2、即使对象本身线程安全，但如果该对象中包含其他资源（文件，数据库连接），整个应用也许就不再是线程安全的了。
 *    比如2个线程都创建了各自的数据库连接，每个连接自身是线程安全的，但它们所连接到的同一个数据库也许不是线程安全的。
 *
 *
 *
 * @Date: Crated in 17:11 2019-04-12
 * @Modify By:
 */
public class Counter {

    protected long count = 0;


    public void add(int value) {
        this.count = this.count + value;
        System.out.println(count);
    }

    /**
     * 当两个线程竞争同一资源时，如果对资源的访问顺序敏感，就称存在竞态条件。
     * 导致竞态条件发生的代码区称作临界区。上例中add()方法就是一个临界区,它会产生竞态条件。在临界区中使用适当的同步就可以避免竞态条件。
     */
    @Test
    public void addCounter() {
        for (int i = 1; i <= 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "running");
                    add(1);
                }
            }, "线程名" + i).start();
        }
    }


    public void add() {
        long threadSafeInt = 0L;
        threadSafeInt++;
        System.out.println(threadSafeInt);
    }

    /**
     * 局部变量存储在线程自己的栈中。也就是说，局部变量永远也不会被多个线程共享。
     * 基础类型的局部变量是线程安全的。
     */
    @Test
    public void someMethod() {
        for (int i = 1; i <= 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "running");
                    add();
                }
            }, "线程名" + i).start();
        }
    }


    public void addObject() {
        Student student = new Student();
        student.getName();
        addObject2(student);
    }

    public void addObject2(Student student) {
        student.setAge(18);
    }

    /**
     * 对象的局部引用和基础类型的局部变量不太一样。尽管引用本身没有被共享，但引用所指的对象并没有存储在线程的栈内。
     * 所有的对象都存在共享堆中。如果在某个方法中创建的对象不会逃逸出该方法，那么它就是线程安全的。
     * 实际上，哪怕将这个对象作为参数传给其它方法，只要别的线程获取不到这个对象，那它仍是线程安全的。
     * <p>
     * <p>
     * Student对象没有被方法返回，也没有被传递给addObject()方法外的对象。每个执行addObject()的线程都会创建自己的Student对象，
     * 并赋值给student引用。因此，这里的Student是线程安全的。事实上，整个addObject()都是线程安全的。
     * 即使将Student作为参数传给同一个类的其它方法或其它类的方法时，它仍然是线程安全的。
     * 当然，如果Student通过某些方法被传给了别的线程，那它就不再是线程安全的了。
     */
    @Test
    public void someMethodObject() {
        for (int i = 1; i <= 20; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + "running");
                    addObject();
                }
            }, "线程名" + i).start();
        }
    }


    /**
     * 对象成员存储在堆上。如果两个线程同时更新同一个对象的同一个成员，那这个代码就不是线程安全的
     * 如果两个线程同时调用同一个NotThreadSafe实例上的add()方法，就会有竞态条件问题
     * 注意两个MyRunnable共享了同一个NotThreadSafe对象。因此，当它们调用add()方法时会造成竞态条件
     */
    @Test
    public void someMethodObject1() {
        NotThreadSafe notThreadSafe = new NotThreadSafe();
        new Thread(new MyRunnable(notThreadSafe)).start();
        new Thread(new MyRunnable(notThreadSafe)).start();

        //解决竞态
        //现在两个线程都有自己单独的NotThreadSafe对象，调用add()方法时就会互不干扰，再也不会有竞态条件问题了。所以非线程安全的对象仍可以通过某种方式来消除竞态条件。
        new Thread(new MyRunnable(new NotThreadSafe())).start();
        new Thread(new MyRunnable(new NotThreadSafe())).start();
    }


}
