package com.test.date;

import org.junit.Test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author: lijl
 * @Description:
 * 在阿里巴巴规约手册里，强制规定SimpleDateFormat是线程不安全的类，当定义为静态变量时，必须加锁处理。
 * 忽略线程安全问题，正是大多数Java初学者在进行时间转化时容易踩坑的点。
 *
 * @Date: Crated in 10:27 2019-06-18
 * @Modify By:
 */
public class DateTest {

    @Test
    public void testDate() {
        User user = new User("happyjava", new Date());
        System.out.println(user.getBirthday());
        Date birthday = user.getBirthday();
        //这里可以看到，user对象的birthday属性被修改掉了。这也是Date对象的弊端所在，我们可以通过改写getter方法，使它返回一个新的Date对象即可解决
        birthday.setTime(111122221111L);
        System.out.println(user.getBirthday());
    }


    /**
     * jdk8 提供LocalDateTime
     * DateTimeFormatter是线程安全的
     */
    @Test
    public void testNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }

    /**
     * 根据时间戳
     */
    @Test
    public void testNewFromTimestamp() {
        Instant instant = Instant.ofEpochMilli(System.currentTimeMillis());
        //+8意思是东八区
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, ZoneId.of("+8"));
        System.out.println(dateTime);

        instant = Instant.ofEpochSecond(System.currentTimeMillis()/1000);
        //+8意思是东八区
        dateTime = LocalDateTime.ofInstant(instant, ZoneId.of("+8"));
        System.out.println(dateTime);
    }


    /**
     * 可以使用LocalDateTime.parse方法对字符串进行转化成时间，如果不传pattern，默认是2019-05-06T11:16:12.361格式
     */
    @Test
    public void testNewFromString() {
        // 1.默认格式 2019-05-06T11:16:12.361
        String dateStr = "2019-05-06T11:16:12.361";
        LocalDateTime localDateTime = LocalDateTime.parse(dateStr);
        System.out.println(localDateTime);
        // 2. 自定义格式
        String pattern = "yyyy-MM-dd HH:mm:ss";
        dateStr = "2019-01-01 12:12:12";
        localDateTime = LocalDateTime.parse(dateStr, DateTimeFormatter.ofPattern(pattern));
        System.out.println(localDateTime);
    }

    /**
     * 可以通过DateTimeFormatter的format方法，将LocalDateTime转化成字符串
     */
    @Test
    public void testToString() {
        LocalDateTime now = LocalDateTime.now(ZoneId.of("+8"));
        String pattern = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        String format = formatter.format(now);
        System.out.println(format);
    }

    /**
     * LocalDateTime转时间戳
     */
    @Test
    public void testDateToTimeMillis() {
        LocalDateTime dateTime = LocalDateTime.now();
        long epochMilli = dateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        System.out.println(epochMilli);
        long epochSecond = dateTime.toInstant(ZoneOffset.of("+8")).getEpochSecond();
        System.out.println(epochSecond);
    }








}
