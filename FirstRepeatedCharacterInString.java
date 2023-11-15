package com.StreamApiProgram;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacterInString {

	public static void main(String[] args) {
//		"JavaisEasy"
		String str="Java is Easy".replace(" ", "").toLowerCase();//javaiseasy
//	Stream--->	j a v a i s.....
//		grouping --> j=1, a=3.....
		  String c = Arrays.stream(str.split(""))
		 					.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 					.entrySet().stream().filter(e->e.getValue()>1).map(e-> e.getKey()).findFirst().get();
		  System.out.println("First Repeated Character In String :"+c);

		  
		 
		  }

}
