package com.test.jvm.divide;

/**
 * 
 * @ClassName: StackOverFlow
 * @Description: java栈溢出
 * @author lijl
 * @date Crated in 18:20 2019-04-12
 *
 */
public class StackOverFlow {
	private int i;

	public void plus() {
		i++;
		plus();
	}

	public static void main(String[] args) {
		StackOverFlow stackOverFlow = new StackOverFlow();
		try {
			stackOverFlow.plus();
		} catch (Exception e) {
			System.out.println("Exception:stack length:" + stackOverFlow.i);
			e.printStackTrace();
		} catch (Error e) {
			System.out.println("Error:stack length:" + stackOverFlow.i);
			e.printStackTrace();
		}
	}
}