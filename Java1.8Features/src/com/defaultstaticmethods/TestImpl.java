package com.defaultstaticmethods;

public class TestImpl implements Test{
	
	/*@Override
	public void m1() {
		System.out.println("TestImpl method");
	}*/
	
	//@Override
	static void m2() {
		System.out.println("m2 method in testimpl class");
	}
	
	public static void main(String[] args) {
		TestImpl t = new TestImpl();
		t.m1();
		
		Test.m2();
		TestImpl.m2();
	}
}
