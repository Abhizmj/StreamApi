package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;

public class FindCountOfNumberInList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,2,3,45,67,3,9,90,87,65);
		long c = list.stream().count();
		System.out.println("Number present in List :"+c);
//		Fetch count of those number which is greater than 50
		long countGreater50 = list.stream().filter(e->e>50).count();
		System.out.println("number which is greater than 50 is "+countGreater50);
		
		
	}

}
