package com.StringsPractice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//StringBuilder sb = new StringBuilder();
		String s = new String();
		System.out.println("enter a string");
		s=sc.nextLine();
		
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;i--)
			System.out.print(s.charAt(i));		
	}

}
