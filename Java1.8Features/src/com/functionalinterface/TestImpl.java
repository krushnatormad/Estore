package com.functionalinterface;

public class TestImpl implements Test {

	@Override
	public void getStudentName(String name) {
		System.out.println(name);
	}

	public static void main(String[] args) {
		Test t = new TestImpl();
		t.getStudentName("ram");
	}
}
