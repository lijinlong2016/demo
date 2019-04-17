package com.test.product.createMode.abstractfactory.provider;

import com.test.product.createMode.abstractfactory.send.Sender;
import com.test.product.createMode.abstractfactory.send.SmsSender;

public class SendSmsFactory implements Provider{  
  
    @Override  
    public Sender produce() {  
        return new SmsSender();  
    }  
}  