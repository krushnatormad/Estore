package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(45);
		list.add(25);
		list.add(60);
		list.add(30);
		
		long no = list.stream().filter(i -> i>35).count();
		System.out.println(no);
		
		List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> customizedSortedList = 
				list.stream().sorted((i1,i2) -> (i1<i2)?1 : (i1>i2)?-1 : 0).collect(Collectors.toList());
		System.out.println(customizedSortedList);
		
		int min = list.stream().min((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		
		int max = list.stream().max((i1,i2) -> i1.compareTo(i2)).get();
		System.out.println(max);
		
		list.stream().forEach(System.out::println);
	}
}
