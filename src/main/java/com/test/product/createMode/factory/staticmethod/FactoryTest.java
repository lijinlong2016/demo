package com.test.product.createMode.factory.staticmethod;

import com.test.product.createMode.factory.ordinary.Sender;

/**
 * 多个静态方法
 * 将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 */
public class FactoryTest {

	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();
		sender.Send();
	}
}