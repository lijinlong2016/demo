package com.test.thead;

import com.test.thead.entity.ImmutableValue;

/**
 * @Author: lijl
 * @Description: 线程安全及不可变性
 * @Date: Crated in 18:20 2019-04-12
 * @Modify By:
 */
public class Calculator {


    private ImmutableValue currentValue = null;


    /**
     * 获取
     *
     * @return currentValue
     */
    public ImmutableValue getCurrentValue() {
        return this.currentValue;
    }

    /**
     * 设置
     *
     * @param currentValue
     */
    public void setCurrentValue(ImmutableValue currentValue) {
        this.currentValue = currentValue;
    }


    /**
     * Calculator类持有一个指向ImmutableValue实例的引用。
     * 注意，通过setValue()方法和add()方法可能会改变这个引用。
     * 因此，即使Calculator类内部使用了一个不可变对象，但Calculator类本身还是可变的，因此Calculator类不是线程安全的。
     * 换句话说：ImmutableValue类是线程安全的，但使用它的类不是。当尝试通过不可变性去获得线程安全时，这点是需要牢记的。
     *
     * 要使Calculator类实现线程安全，将getValue()、setValue()和add()方法都声明为同步方法即可。
     * @param newValue
     */
    public void add(int newValue) {
        this.currentValue = this.currentValue.add(newValue);
    }

}
