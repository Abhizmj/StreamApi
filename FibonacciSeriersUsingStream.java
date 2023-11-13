package com.StreamApiProgram;

import java.util.stream.Stream;

public class FibonacciSeriersUsingStream {

	public static void main(String[] args) {
//		0 1 1 2 3....
		Stream.iterate(new int[] {0,1},f->new int[] {f[1],f[0]+f[1]})
		       .limit(20).map(f->f[0])
		        .forEach(e->System.out.print(e+" "));
					
		

	}

}
