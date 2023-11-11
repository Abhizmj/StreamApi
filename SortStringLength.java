package com.StreamApiProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortStringLength {
//Given list of String ,sort them according to increasing order of thier length
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Java","Python","C#","HTML","Kotlin","C++","Cobol","C");
		asList.stream().sorted(Comparator.comparing(String::length))
						.collect(Collectors.toList())
						.forEach(System.out::println);
	}

}
