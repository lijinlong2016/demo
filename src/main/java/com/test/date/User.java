package com.test.date;

import java.util.Date;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 10:23 2019-06-18
 * @Modify By:
 */
public class User {


    public User() {

    }

    public User(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    private String name;

    private Date birthday;


    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return birthday
     */
    public Date getBirthday() {
        return new Date(birthday.getTime());
    }

    /**
     * 设置
     *
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
