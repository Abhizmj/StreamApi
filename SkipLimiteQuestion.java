package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;

public class SkipLimiteQuestion {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(4,5,6,8,28,35,46,77,78,22);
//		limit to 5 
		number.stream().limit(5).forEach(System.out::println);
		System.out.println("=======================================");
//		skip to 4
		number.stream().skip(4).forEach(System.out::println);

	}

}
