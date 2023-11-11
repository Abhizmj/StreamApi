package com.StreamApiProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
//Fetch the number which is greater and equal to 15
	public static void main(String[] args) {
		
		 List<Integer> asList = Arrays.asList(15,25,50,5,67,12,45,98);		
		asList.stream().filter(a -> a>=15).collect(Collectors.toList()).forEach(s -> System.out.print(s+" "));
		
	}

}
