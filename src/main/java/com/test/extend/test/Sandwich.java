package com.test.extend.test;

import sun.jvm.hotspot.oops.BranchData;

/**
 * @Author: lijl
 * @Description:
 * @Date: Crated in 22:44 2019-06-16
 * @Modify By:
 */
public class Sandwich extends ProtableLunch {


    public Sandwich() {
        System.out.println("Sandwich()");

    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
