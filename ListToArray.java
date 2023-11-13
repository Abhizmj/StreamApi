package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11,2,3,45,67,3,9,90,87,65);//o/p= [11,2,3,45,67,3,9,90,87,65]
		Object[] array = list.stream().toArray();
		System.out.println("Elements in Array is ");
		for (Object obj : array) {
			System.out.print(obj+" ");
		}
		System.out.println();
		Object[] array2 = list.stream().toArray();
		System.out.println("Elements in Array is ");
		for (Object obj : array2) {
			System.out.print(obj+" ");
		}
	}

}
