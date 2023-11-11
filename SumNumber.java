package com.StreamApiProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

//1) Find the sum of the number in collection object by using stream api
public class SumNumber {

	public static void main(String[] args) {
//		List<Integer> list= new ArrayList<Integer>();
//		list.add(12);
//		list.add(9);
//		list.add(5);
//		list.add(10);
		List<Integer> list = Arrays.asList(12,9,5,10);
		
		 Integer integer = list.stream().reduce((a,b) -> a+b).get();
		 System.out.println("Sum is : "+integer);
		 
//		 
//		 IntStream: it is stream of primitive int value.
//		 Stream<Integer>:it is stream of Integer object
		 IntStream.range(1, 10).forEach(e-> System.out.print(e+" "));
		 System.out.println();
		 IntStream.rangeClosed(1, 10).forEach(e-> System.out.print(e+" "));
		 
		 System.out.println();
//		 Find the sum of First 10 natural number
		 int sum = IntStream.range(1, 11).sum();
		 System.out.println("SUM is :"+sum);

	}

}
