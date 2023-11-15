package com.StreamApiProgram;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContactinateStream {

	public static void main(String[] args) {
//	way1
		int[] a= {4,2,7,1,6};
		int[] b= {8,3,9,5};
		IntStream stream1 = Arrays.stream(a);
		IntStream stream2 = Arrays.stream(b);
		 int[] x = IntStream.concat(stream1, stream2).sorted().toArray();
		 System.out.println(Arrays.toString(x));
//	way2	 
		 Stream<Integer> a1 = Arrays.asList(2,5,1,8,9).stream();
		 Stream<Integer> a2 = Arrays.asList(4,6,0,7).stream();
		 
		 Stream.concat(a1, a2).sorted().collect(Collectors.toList()).forEach(s-> System.out.print(s+" ,"));
		 
		 

	}

}
