package com.test.thead.testClass;

/**
 * @Author: lijl
 * @Description: 对象成员
 * @Date: Crated in 17:39 2019-04-12
 * @Modify By:
 */
public class NotThreadSafe {

    StringBuilder builder = new StringBuilder();


    public void add(String text) {
        this.builder.append(text);
        System.out.println(builder);
    }

}
