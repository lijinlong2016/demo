package com.test.product.createMode.abstractfactory.send;

public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms send!");
    }
}  