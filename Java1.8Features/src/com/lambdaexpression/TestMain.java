package com.lambdaexpression;

public class TestMain {

	public static void main(String[] args) {
		Addition addition = (a,b) -> (a+b);
		System.out.println(addition.add(10, 20));
		
		Addition addition2 = (int a, int b) -> (a+b);
		System.out.println(addition2.add(20, 30));
	}
	
}
