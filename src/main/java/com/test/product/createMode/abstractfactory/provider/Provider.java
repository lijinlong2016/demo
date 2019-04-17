package com.test.product.createMode.abstractfactory.provider;

import com.test.product.createMode.abstractfactory.send.Sender;

public interface Provider {
	public Sender produce();
}