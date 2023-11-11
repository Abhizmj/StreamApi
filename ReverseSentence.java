package com.StreamApiProgram;

import java.util.Arrays;
import java.util.stream.Collectors;
//Reverse of the word of each string
public class ReverseSentence {

	public static void main(String[] args) {
		String str="Java is easy";// ----> o/p: avaJ si ysae
		String[] s = str.split(" ");//[Java,is,easy]
		Arrays.stream(s).map(w-> new StringBuffer(w).reverse())
						.collect(Collectors.toList())
						.forEach(e-> System.out.print(e));//avaJsiysae
		System.out.println();
		
		String reverse = Arrays.stream(s).map(w-> new StringBuffer(w).reverse())
						.collect(Collectors.joining(" "));
		System.out.println(reverse);
						
	}

}
