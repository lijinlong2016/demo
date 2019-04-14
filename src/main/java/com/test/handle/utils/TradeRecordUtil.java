package com.test.handle.utils;

import java.util.HashMap;
import java.util.Map;

import com.test.handle.Handle;
import com.test.handle.RechargeHandle;
import com.test.handle.WithdrawHandle;

public class TradeRecordUtil {

	private Map<String, Handle> tradeRecordMap = new HashMap<String, Handle>();

	/* 私有构造方法，防止被实例化 */
	private TradeRecordUtil() {
		tradeRecordMap.put("10002", RechargeHandle.getInstance());
		tradeRecordMap.put("10003", WithdrawHandle.getInstance());
	}

	/* 获取实例 */
	public static TradeRecordUtil getInstance() {
		return TradeRecordUtilFactory.instance;
	}

	public Handle getBusiHandle(String businessCode) {
		return tradeRecordMap.get(businessCode);
	}

	/* 此处使用一个内部类来维护单例 */
	private static class TradeRecordUtilFactory {
		private static TradeRecordUtil instance = new TradeRecordUtil();
	}

	/* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */
	public Object readResolve() {
		return getInstance();
	}
}