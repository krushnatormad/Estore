package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(15);
		list.add(6);
		list.add(4);
		
		//List<Integer> newList = new ArrayList<>();
		/*for(Integer i : list) {
			if(i>5) {
				newList.add(i);
			}
		}
		
		System.out.println(newList);*/
		
		List<Integer> newList = list.stream().filter(x -> x>5).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> squareList = list.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(squareList);
		
		List<Integer> evenNo = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println(evenNo);
		
		List<Integer> oddNo =list.stream().filter(i -> i%2!=0).collect(Collectors.toList());
		System.out.println(oddNo);
		
		long no1 = list.stream().filter(i -> i%2==0).count();
		System.out.println(no1);
		
		long no2 = list.stream().filter(i -> i%2!=0).count();
		System.out.println(no2);
	}
}
