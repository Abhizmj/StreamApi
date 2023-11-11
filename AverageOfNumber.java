package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

//2) Find the average of the number present in collection by using stream 
public class AverageOfNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,9,5,10);
		double d = list.stream().mapToInt( e -> e ).average().getAsDouble();
		System.out.println("Average of the number is : "+d);
//	or	
		double e = IntStream.of(12,9,5,10).average().getAsDouble();
		System.out.println("Average is :"+e);
		

	}

}
