package com.test.handle.test;

import com.test.handle.Handle;
import com.test.handle.utils.TradeRecordUtil;

import java.util.Map;


public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        Map<String, String> resultMap1 = test.go("10002", "CZ10002");
        System.out.println(resultMap1);
        Map<String, String> resultMap2 = test.go("10003", "TX10003");
        System.out.println(resultMap2);
        Map<String, String> resultMap11 = test.go("10002", "CZ10002");
        System.out.println(resultMap11);
        Map<String, String> resultMap22 = test.go("10003", "TX10003");
        System.out.println(resultMap22);
    }

    public Map<String, String> go(String businessCode, String orderId) {
        Handle sender = TradeRecordUtil.getInstance().getBusiHandle(businessCode);
        return sender.handle(orderId);
    }
}