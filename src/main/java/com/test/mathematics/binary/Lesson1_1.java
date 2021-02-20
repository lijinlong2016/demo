package com.test.mathematics.binary;

import java.math.BigInteger;

/**
 * @Author: lijl
 * @Description: 二进制、八进制、十进制、十六进制相互转换
 * @Date: Crated in 13:18 2019-06-10
 * @Modify By:
 */
public class Lesson1_1 {


    /**
     * 十进制转二进制
     *
     * @param decimalSource
     * @return
     */
    public static String decimalToBinary(int decimalSource) {
        BigInteger bi = new BigInteger(String.valueOf(decimalSource));
        return bi.toString(2);
    }

    /**
     * 八进制转二进制
     *
     * @param octonarySource
     * @return
     */
    public static String octonaryToBinary(int octonarySource) {
        BigInteger bi = new BigInteger(String.valueOf(octonarySource), 8);
        return bi.toString(2);
    }


    /**
     * 十六进制转二进制
     *
     * @param hexadecimalSource
     * @return
     */
    public static String hexadecimalToBinary(int hexadecimalSource) {
        BigInteger bi = new BigInteger(String.valueOf(hexadecimalSource), 16);
        return bi.toString(2);
    }

    /**
     * 二进制转十进制
     *
     * @param binarySource
     * @return
     */
    public static int binaryToDecimal(String binarySource) {
        BigInteger bi = new BigInteger(binarySource, 2);
        return Integer.parseInt(bi.toString());
    }

    /**
     * 二进制转八进制
     *
     * @param binarySource
     * @return
     */
    public static int binaryToOctonary(String binarySource) {
        BigInteger bi = new BigInteger(String.valueOf(binarySource), 2);
        return Integer.parseInt(bi.toString(8));
    }


    /**
     * 二进制转十六进制
     *
     * @param binarySource
     * @return
     */
    public static int hexadecimalToBinary(String binarySource) {
        BigInteger bi = new BigInteger(String.valueOf(binarySource), 2);
        return Integer.parseInt(bi.toString(16));
    }


    public static void main(String[] args) {

        int a = 53;
        String b = "110101";
        System.out.println(String.format(" 数字 %d 的二进制是 %s", a, Lesson1_1.decimalToBinary(a))); // 获取十进制数 53 的二进制数
        System.out.println(String.format(" 数字 %s 的十进制是 %d", b, Lesson1_1.binaryToDecimal(b))); // 获取二进制数 110101 的十进制数

        int c = 0650;
        String d = "100010100";
        System.out.println(String.format(" 数字 %d 的二进制是 %s", c, Lesson1_1.octonaryToBinary(c)));
        System.out.println(String.format(" 数字 %s 的八进制是 %d", d, Lesson1_1.binaryToOctonary(d)));


    }


}
