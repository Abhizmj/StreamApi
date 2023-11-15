package com.StreamApiProgram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Given a list of String join the string with "[" as prefix and suffix will be "]" delimitter as ","
public class AddBrackectsAndCommas {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Fackbook","Twitter","Instagram","Watsapp","youtube");
//		o/p===> [Fackbook,Twitter,Instagram,Watsapp,youtube]
		String collect = list.stream().collect(Collectors.joining(",","[","]"));
		System.out.println(collect);
		
		String collect1 = list.stream().collect(Collectors.joining("-","{","}"));
		System.out.println(collect1);
		
		String collect2 = list.stream().collect(Collectors.joining(":","(",")"));
		System.out.println(collect2);
	}

}
