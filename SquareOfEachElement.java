package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//3) Square of each an every number
public class SquareOfEachElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,9,5,10);
		
		list.stream().map(e -> e*e).collect(Collectors.toList()).forEach(s ->System.out.print(s+" "));
		
		System.out.println("---------------------------------------------------------");
		
		list.stream().map(e -> e*e).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("---------------------------------------------------------");
		
		//Fetch that number which is less than 100
		list.stream().map(e -> e*e).filter(e -> e<100).collect(Collectors.toList()).forEach(s ->System.out.println(s+" "));
	}

}
