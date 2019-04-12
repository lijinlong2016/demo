package com.test.thead.entity;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 17:29 2019-04-12
 * @Modify By:
 */
public class Student {


    /**
     * 学生号
     */
    private String id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 获取 学生号
     *
     * @return id 学生号
     */
    public String getId() {
        return this.id;
    }

    /**
     * 设置 学生号
     *
     * @param id 学生号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取 姓名
     *
     * @return name 姓名
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置 姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 年龄
     *
     * @return age 年龄
     */
    public int getAge() {
        return this.age;
    }

    /**
     * 设置 年龄
     *
     * @param age 年龄
     */
    public void setAge(int age) {
        this.age = age;
    }



}
