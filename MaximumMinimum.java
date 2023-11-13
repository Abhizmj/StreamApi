package com.StreamApiProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumMinimum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,2,3,45,67,3,9,90,87,65);
	 Integer maxNum = list.stream().max(Comparator.comparing(Integer::valueOf)).get();
	 System.out.println("Maximum number is :"+maxNum);
	 
	 System.out.println("=========================================");
	 Integer minNum = list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	 System.out.println("Minimum number is :"+minNum);
	 

	}

}
