package com.test.product.createMode.abstractfactory.provider;

import com.test.product.createMode.abstractfactory.send.MailSender;
import com.test.product.createMode.abstractfactory.send.Sender;

public class SendMailFactory implements Provider {  
      
    @Override  
    public Sender produce(){  
        return new MailSender();  
    }  
}  