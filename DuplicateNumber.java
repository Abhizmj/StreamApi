package com.StreamApiProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Print duplicate number with steam
public class DuplicateNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,34,54,22,2,7,8,7,4,4,90,21,2); 
		
		list.stream().filter(e -> Collections.frequency(list, e)>1).collect(Collectors.toSet()).forEach(s-> System.out.print(s+" "));
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
//		or
		Set<Integer> dup= new HashSet<Integer>();
//		dup.add(12);
		list.stream().filter(e -> !dup.add(e)).collect(Collectors.toSet()).forEach(s-> System.out.print(s+" "));
	}

}
