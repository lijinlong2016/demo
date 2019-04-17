package com.test.product.createMode.factory.ordinary;

public class SmsSender implements Sender {

    @Override
    public void Send() {

        System.out.println("this is sms send!");
    }
}  