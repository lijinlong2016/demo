package com.test.jvm.divide;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * 
 * @ClassName: DirectoryMemoryOutOfmemory
 * @Description: 直接内存溢出测试
 * @author lijl
 * @date Crated in 18:20 2019-04-12
 *
 */
@SuppressWarnings("restriction")
public class DirectoryMemoryOutOfmemory {
	private static final int ONE_MB = 1024 * 1024;
	private static int count = 1;

	public static void main(String[] args) {
		try {
			Field field = Unsafe.class.getDeclaredField("theUnsafe");
			field.setAccessible(true);
			Unsafe unsafe = (Unsafe) field.get(null);
			while (true) {
				unsafe.allocateMemory(ONE_MB);
				count++;
			}
		} catch (Exception e) {
			System.out.println("Exception:instance created " + count);
			e.printStackTrace();
		} catch (Error e) {
			System.out.println("Error:instance created " + count);
			e.printStackTrace();
		}
	}
}