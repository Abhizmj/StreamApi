package com.StreamApiProgram;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OccurenceOfWordInSentence {

	public static void main(String[] args) {
		String str="welcome to code java and code java welcome you";//welcome=2
		
		
		Map<String, Long> map = Stream.of(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		System.out.println("=======================================================");
		String word="Welcome to Code Java and code java welcome you";
		String s = word.toLowerCase();
		Map<String, Long> map2 = Stream.of(s.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map2);
		
		System.out.println("========================================================");
		String sentence="Welcome to Code Java .Code java welcome you ! and is java (easy) ? ";
		String s1 = sentence.toLowerCase();
		Map<String, Long> map3 = Stream.of(s1.split("\\W+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map3);

		System.out.println("========================================================");
		Stream.of(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
								.entrySet().stream()
								.collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
								.entrySet().stream().collect(Collectors.toList()).forEach(e-> System.out.println(e+" "));
		System.out.println("========================================================");

		 Stream.of(s1.split("\\W+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 					.entrySet().stream()
		 					.filter(e-> e.getValue()>1).collect(Collectors.toList())
		 					.forEach(e-> System.out.print(e+" "));
		
	}

}
