package com.test.algorithm;

public class AlgorithmUtil {

	public static int temp, index = 0;

	/**
	 * 临时值交换
	 * 
	 * @param datas
	 *            数组
	 * @param i
	 * @param j
	 */
	public static void swap(int[] datas, int i, int j) {
		temp = datas[i];
		datas[i] = datas[j];
		datas[j] = temp;
	}

	/**
	 * 扩充数组长度
	 * 
	 * @param datas
	 * @param value
	 * @return
	 */
	public static int[] expandArray(int[] datas, int value) {
		if (datas.length <= index) {
			int[] arrays = new int[datas.length * 2];
			System.arraycopy(datas, 0, arrays, 0, datas.length);
			datas = arrays;
		}
		datas[index] = value;
		index++;
		return datas;
	}
}
