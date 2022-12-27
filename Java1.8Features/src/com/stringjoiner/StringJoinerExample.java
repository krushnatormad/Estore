package com.stringjoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner stringJoiner = new StringJoiner("-");
		stringJoiner.add("ram");
		stringJoiner.add("shyam");
		stringJoiner.add("geeta");
		
		System.out.println(stringJoiner);
	}
}
