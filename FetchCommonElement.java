package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FetchCommonElement {

	public static void main(String[] args) {
		List<Integer> l1 = Arrays.asList(71,21,34,56,28,65);
		List<Integer> l2 = Arrays.asList(12,56,17,28,94,34);
		
//		common elements are: 34,28,56
		
		l1.stream().filter(l2::contains).collect(Collectors.toList()).forEach(s-> System.out.print(s+" "));
		System.out.println();
		 System.out.println("===============================================");
		l1.stream().filter(e->l2.contains(e)).collect(Collectors.toList()).forEach(s-> System.out.print(s+" "));
		
		  List<String> s1 = Arrays.asList("Pen","Box","Pencil");
		 List<String> s2 = Arrays.asList("Pen","Eraser","Note");
		 System.out.println();
		 System.out.println("===============================================");
		 
		 s1.stream().filter(s2::contains).collect(Collectors.toList()).forEach(s-> System.out.print(s+" "));

	}

}
