package com.foreach;

import java.util.HashMap;
import java.util.Map;
//import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "ram");
		map.put(102, "shyam");
		map.put(103, "geeta");
		map.put(104, "seeta");
		
		/*Set<Integer> set = map.keySet();
		for(Integer i : set) {
			System.out.print(i+" ");
			System.out.println(map.get(i));
		}*/
		
		//(k,v) -> sysout(k+" "+v);
		map.forEach((k,v) -> System.out.println("key = "+ k +", value = " +v));
	}
}
