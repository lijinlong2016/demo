package com.test.jvm.divide;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lijl
 * @ClassName: ConstantOutOfMemory
 * @Description: 常量池溢出
 * @date Crated in 18:20 2019-04-12
 */
public class ConstantOutOfMemory {

    public static void main(String[] args) throws Exception {
        try {
            List<String> strings = new ArrayList<String>();
            int i = 0;
            while (true) {
                strings.add(String.valueOf(i++).intern());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

}