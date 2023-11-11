package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Print number which starts with 2 or prefixed with 2 using stream
public class PrefixWithPattern {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(22,9,5,20,13,26,81,232,42);
		list.stream().map(e -> String.valueOf(e))//"22","9".....
									.filter(e -> e.startsWith("2"))
									.map(e->Integer.valueOf(e))
									.collect(Collectors.toList())
									.forEach(s -> System.out.print(s +" "));
		
	}

}
