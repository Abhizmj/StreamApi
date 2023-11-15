package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountEmptyString {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Java","","coding","easy","","with","brain","");
		long c = list.stream().filter(e-> e.isEmpty()).count();
		System.out.println("Count = "+c);

//		eleminating spaces===> 
		String[] s = {"Java","","coding","easy","","with","brain",""};
		Arrays.stream(s).filter(e->!e.isEmpty()).collect(Collectors.toList()).forEach(e-> System.out.print(e+","));
		
		System.out.println();
		System.out.println("==========================================================");
//remove empty string and null
		List<String> list2 = Arrays.asList("Java",null,"coding","easy","","with","brain","",null);
		list2.stream().filter(e-> (e!=null && e.length()>0)).collect(Collectors.toList()).forEach(e-> System.out.print(e+" "));
		
		
		
		
	}

}
