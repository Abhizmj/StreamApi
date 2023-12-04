package com.StringProgram.pack;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start range and End range");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("The Prime number within given range are : ");
		String prime = IntStream.rangeClosed(a,b).filter(e->isPrime(e)).boxed().map(e->e+"").collect(Collectors.joining(","));

		System.out.print(prime);
	}
	public static boolean isPrime(int number) {
		if(number<=1) return false;
		return !IntStream.rangeClosed(2, number/2).anyMatch(i->number%i==0);
	}

}
