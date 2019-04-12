package com.test.thead.entity;

/**
 * @Author: lijl
 * @Description: 我们可以通过创建不可变的共享对象来保证对象在线程间共享时不会被修改，从而实现线程安全。
 * <p>
 * 注意，“不变”（Immutable）和“只读”（Read Only）是不同的。当一个变量是“只读”时，
 * 变量的值不能直接改变，但是可以在其它变量发生改变的时候发生改变。
 * 比如，一个人的出生年月日是“不变”属性，而一个人的年龄便是“只读”属性，但是不是“不变”属性。随着时间的变化，
 * 一个人的年龄会随之发生变化，而一个人的出生年月日则不会变化。这就是“不变”和“只读”的区别。
 * @Date: Crated in 18:14 2019-04-12
 * @Modify By:
 */
public class ImmutableValue {

    private int value = 0;

    public ImmutableValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    /**
     * 请注意add()方法以加法操作的结果作为一个新的ImmutableValue类实例返回，而不是直接对它自己的value变量进行操作。
     *
     * @param valueToValue
     * @return
     */
    public ImmutableValue add(int valueToValue) {
        return new ImmutableValue(this.value + valueToValue);

    }
}
