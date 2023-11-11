package com.StreamApiProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(45,12,56,15,24,75,75,76,31,89);//12,24,31...,75,89 asc
//		reverse order-->89,75...12
//		after skip first--> 75,12..
			 Integer i = asList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
			 System.out.println("Second largest number is :"+i);
	}

}
