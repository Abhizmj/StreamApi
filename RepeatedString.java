package com.StreamApiProgram;

public class RepeatedString {

	public static void main(String[] args) {
		
		String s = "Hi! This is Amiti Sotware Technologies. This is your question paper. Paper contains many questions!\r\n"
				+ "";
		String s1="";
		int count=0;
		String[] s2 = s.split(s);
		for(int i=0;i<s2.length;i++) {
			String temp = s2[i];
			if(s.contains(temp)) {
			s1+=temp;
			count++;
			System.out.println(s1+"-"+count);
			}
		}
		
	}

}
