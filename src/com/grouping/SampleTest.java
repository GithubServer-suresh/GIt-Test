package com.grouping;

import java.util.StringTokenizer;

public class SampleTest {

	public static void main(String[] args) {
		
		String s = "Welcome To Brillio";
		String[] strings = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String str : strings ) {
			System.out.println(str);
			for(int i=str.length()-1;i>=0;i++) {
				char first = (char)str.indexOf(str.length());
				System.out.println(str.charAt(i));
			}
		}
		
		
		
		
		
		/*StringTokenizer st = new StringTokenizer(s);
		StringBuilder sb = new StringBuilder();
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
			for(char ch : token.toCharArray()) {
				char upperCase = Character.toUpperCase(token.charAt(token.length()));
			
				System.out.println(upperCase);
				sb = sb.append(upperCase);
			}
			System.out.println(sb.toString());
			
		}
*/		
		
	}

}
