package com.test.handle;

import java.util.Map;

public class WithdrawHandle implements Handle {

	private WithdrawHandle() {
		System.out.println("WithdrawHandle init");
	}

	public static WithdrawHandle getInstance() {
		return WithdrawHandleFactory.instance;
	}

	private static class WithdrawHandleFactory {
		private static WithdrawHandle instance = new WithdrawHandle();
	}
	
	@Override
	public Map<String, String> handle(String orderId) {
		System.out.println("this is WithdrawHandle!");
		return null;
	}
}