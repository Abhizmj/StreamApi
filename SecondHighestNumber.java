package com.StreamApiProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(4,5,6,8,28,35,46,77,78,22);//78,77,46,35,28,22,8,6,5,4
		Integer second = number.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second largest number is :"+second);
		
//		Suppose we are have duplicate number then the way to process is:
		List<Integer> number2 = Arrays.asList(4,5,78,6,8,28,35,46,77,78,22);//78,77,46,35,28,22,8,6,5,4
		Integer sec = number2.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println("Second largest number is :"+sec);
	}

}
