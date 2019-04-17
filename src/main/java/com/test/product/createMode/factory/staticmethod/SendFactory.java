package com.test.product.createMode.factory.staticmethod;

import com.test.product.createMode.factory.ordinary.MailSender;
import com.test.product.createMode.factory.ordinary.Sender;
import com.test.product.createMode.factory.ordinary.SmsSender;

/**
 * 多个静态方法
 */
public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}