package com.StreamApiProgram;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintIListInReverseOrder {

	public static void main(String[] args) {
		int[] arr= {11,2,3,45,67,3,9,90,87,65};
//		List<Integer> list = Arrays.asList();//o/p==>[65,87,90,....11]  
		int[] array = IntStream.rangeClosed(1, arr.length).map(e->arr[arr.length-e]).toArray(); //arr[9]=11
		System.out.println(Arrays.toString(array));
		
		
		

	}

}
