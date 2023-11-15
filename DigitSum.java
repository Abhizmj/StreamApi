package com.StreamApiProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DigitSum {

	public static void main(String[] args) {
		int a = 15632;//"15632"
		Integer sum = Stream.of(String.valueOf(a).split(""))
										.collect(Collectors.summingInt(Integer::valueOf));
		System.out.println("Sum of digits is : "+sum);
		
		

	}

}
