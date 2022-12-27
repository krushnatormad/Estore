package com.defaultstaticmethods;

public interface Test {

	default void m1() {
		System.out.println("default method in test interface");
	}
	
	static void m2() {
		System.out.println("m2 method in test interface");
	}
}
