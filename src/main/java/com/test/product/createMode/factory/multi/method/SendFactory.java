package com.test.product.createMode.factory.multi.method;

import com.test.product.createMode.factory.ordinary.MailSender;
import com.test.product.createMode.factory.ordinary.Sender;
import com.test.product.createMode.factory.ordinary.SmsSender;

/**
 * 多个方法
 * 是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象
 */
public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}