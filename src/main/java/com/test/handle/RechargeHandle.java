package com.test.handle;

import java.util.Map;

public class RechargeHandle implements Handle {

    private RechargeHandle() {
        System.out.println("RechargeHandle init");
    }

    public static RechargeHandle getInstance() {
        return RechargeHandleFactory.instance;
    }

    private static class RechargeHandleFactory {
        private static RechargeHandle instance = new RechargeHandle();
    }

    @Override
    public Map<String, String> handle(String orderId) {
        System.out.println("this is RechargeHandle!");
        return null;
    }
}