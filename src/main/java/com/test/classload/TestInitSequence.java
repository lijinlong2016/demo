package com.test.classload;

public class TestInitSequence extends AAA {

	static int pp;

	public static void main(String[] args) {
		TestInitSequence tt = new TestInitSequence();
		tt.test();
	}

	public TestInitSequence() {
		System.out.println("J");
	}

	public void test() {
		System.out.println(this.getUU() + ",pp=" + pp);
	}

	static {
		System.out.println("B");
	}

	{
		System.out.println("D");
	}
}

class AAA {

	private static String uu;

	protected String getUU() {
		return uu;
	}

	public AAA() {
		System.out.println("H");
	}

	static {
		System.out.println("A");
	}

	{
		System.out.println("C");
	}

}