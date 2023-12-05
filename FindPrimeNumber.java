package com.StreamApiProgram;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindPrimeNumber {

	public static void main(String[] args) {
		
	List.of(14,13,86,68,62,58,64,60,100,31).stream()
							.filter(n->(n>1) && (IntStream.rangeClosed(2, n/2).allMatch(i->n%i!=0)))
							.collect(Collectors.toList()).forEach(System.out::println);
//	or
	System.out.println("=========================================");
	
	List.of(14,13,86,68,62,58,64,60,100,31).stream()
						.filter(n->(n>1)).filter(n->IntStream.rangeClosed(2, n/2).allMatch(i->n%i!=0))
						.collect(Collectors.toList()).forEach(e->System.out.print(e+" "));
//	or
	System.out.println("\n=========================================");
	
	String prime = List.of(14,13,86,68,62,58,64,60,100,31).stream()
						.filter(n->(n>1)).filter(n->IntStream.rangeClosed(2, n/2).allMatch(i->n%i!=0))
						.map(e->e+"")
						.collect(Collectors.joining(","));
	System.out.println(prime);
	}

}
