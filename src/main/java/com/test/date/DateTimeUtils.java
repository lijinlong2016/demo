package com.test.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 10:48 2019-06-18
 * @Modify By:
 */
public class DateTimeUtils {
    private DateTimeUtils() {
    }

    private final static String COMMON_PATTERN = "yyyy-MM-dd HH:mm:ss";

    private final static DateTimeFormatter COMMON_FORMATTER = DateTimeFormatter.ofPattern(COMMON_PATTERN);

    private final static ZoneOffset DEFAULT_ZONE_OFFSET = ZoneOffset.of("+8");


    /**
     * 默认 yyyy-MM-dd HH:mm:ss 格式
     */
    public static String dateToString(LocalDateTime dateTime) {
        assert dateTime != null;
        return COMMON_FORMATTER.format(dateTime);
    }


    /**
     * 默认 yyyy-MM-dd HH:mm:ss 格式
     */
    public static LocalDateTime stringToDate(String dateStr) {
        assert dateStr != null;
        return LocalDateTime.parse(dateStr, COMMON_FORMATTER);
    }


    public static String dateToString(LocalDateTime dateTime, DateTimeFormatter formatter) {
        assert dateTime != null;
        return formatter.format(dateTime);
    }

    public static LocalDateTime stringToDate(String dateStr, DateTimeFormatter formatter) {
        assert dateStr != null;
        return LocalDateTime.parse(dateStr, formatter);
    }


    public static long dateToTimeMillis(LocalDateTime dateTime) {
        assert dateTime != null;
        return dateTime.toInstant(DEFAULT_ZONE_OFFSET).toEpochMilli();
    }


    public static LocalDateTime timeMillisToDate(long timeMillis) {
        Instant instant = Instant.ofEpochMilli(timeMillis);
        return LocalDateTime.ofInstant(instant, DEFAULT_ZONE_OFFSET);
    }

    public static void main(String[] args) {
        String s = dateToString(LocalDateTime.now());
        System.out.println(s);
        System.out.println();
        String dateStr = "2019-01-01 12:12:12";
        LocalDateTime localDateTime = stringToDate(dateStr);
        System.out.println(localDateTime);
        System.out.println();
        System.out.println(dateToTimeMillis(localDateTime));
        System.out.println();
        System.out.println(timeMillisToDate(System.currentTimeMillis()));
    }
}
