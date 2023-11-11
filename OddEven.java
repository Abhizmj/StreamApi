package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//4)  Find even or odd number
public class OddEven {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,9,5,10,13,76,81,51,42);
		//even number
		System.out.println("Even numbers are :");
		list.stream().filter(e -> e%2==0).collect(Collectors.toList()).forEach(s-> System.out.print(s+" "));
		System.out.println();
		//odd number
		System.out.println("ODD numbers are :");
		list.stream().filter(e -> e%2!=0).collect(Collectors.toList()).forEach(s-> System.out.print(s+" "));
	}

}
