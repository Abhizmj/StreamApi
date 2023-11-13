package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;

public class SecondLowestNumber {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(4,5,5,4,78,6,8,28,35,46,77,78,22);//4,5,6,8,22,28,35,46,77,78
		Integer second = number.stream().distinct().sorted().skip(1).findFirst().get();
		System.out.println("Second lowest number is :"+second);

	}

}
