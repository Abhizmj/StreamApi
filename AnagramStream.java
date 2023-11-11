package com.StreamApiProgram;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramStream {

	public static void main(String[] args) {
		String s1="RaceCar";//[R,a,c,e,C,a,r] when we use split here ,lowercase -->[r,a,c,e,c,a,r]
		String s2="CarRace";//aaccerr
		
		s1= Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
		if(s1.equals(s2)) System.out.println("Anagram");
		else System.out.println("Not Anagram");
			
		
	}

}
