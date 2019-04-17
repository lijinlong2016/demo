package com.test.jvm.divide;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: HeapOutOfMemory
 * @Description: 堆溢出测试
 * @author lijl
 * @date Crated in 18:20 2019-04-12
 *
 */
public class HeapOutOfMemory {
	public static void main(String[] args) {
		List<TestCase> cases = new ArrayList<TestCase>();
		while (true) {
			cases.add(new TestCase());
		}
	}
}

class TestCase {

}