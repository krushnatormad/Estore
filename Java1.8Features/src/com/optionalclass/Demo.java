package com.optionalclass;

import java.util.Optional;

public class Demo {

	public static void main(String[] args) {
		String[] str = new String[10];
		//String lowerCase = str[5].toLowerCase();
		//System.out.println(lowerCase);
		
		//str[5] = "ABCD";
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			String lowerCase = str[5].toLowerCase();
			System.out.println(lowerCase);
		} else {
			System.out.println("string vlaue is not present");
		}
	}
}
