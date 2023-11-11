package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatingWords {
//Find the most repeated element in an array
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Box","Pen","Book","Box","Pencil","Pen","Pen","Eraser");
		Map<String, Long> collect = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);//{Book=1, Pen=3, Box=2, Pencil=1, Eraser=1}
		System.out.println();
//	or	
		 Entry<String, Long> entry = asList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
						.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		 System.out.println("Most Frequent element :"+entry.getKey());
		 System.out.println("Counts :"+entry.getValue());
	}

}
