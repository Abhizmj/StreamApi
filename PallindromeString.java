package com.StreamApiProgram;

import java.util.stream.IntStream;

public class PallindromeString {

	public static void main(String[] args) {
		String str="Rotator";
		String s = str.toLowerCase();
		boolean b = IntStream.rangeClosed(0,s.length()/2).noneMatch(e->s.charAt(e)!=s.charAt(s.length()-e-1));

		if(b) System.out.println("Is a Pallindrome");
		else System.out.println("Is NOT a Pallindrome");
			
		
	}

}
