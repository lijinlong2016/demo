package com.test.product.createMode.abstractfactory;

import com.test.product.createMode.abstractfactory.provider.Provider;
import com.test.product.createMode.abstractfactory.provider.SendMailFactory;
import com.test.product.createMode.abstractfactory.send.Sender;

public class Test {

    public static void main(String[] args) {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.Send();
    }
}