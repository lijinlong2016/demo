package com.test.product.createMode.factory.ordinary;

public class MailSender implements Sender {

    @Override
    public void Send() {

        System.out.println("this is mailsender!");
    }
}