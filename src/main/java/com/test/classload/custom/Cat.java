package com.test.classload.custom;

public class Cat {
	public Cat() {
		ClassLoader classLoader = this.getClass().getClassLoader();
		ClassLoader parentLoader = classLoader.getParent();
		if (parentLoader != null) {
			System.out.println("Cat," + classLoader + "," + parentLoader);
		} else {
			System.out.println("Cat," + classLoader);
		}
	}
}