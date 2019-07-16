package com.StringsPractice;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,revstr="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		str = sc.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			revstr=revstr+str.charAt(i);
		}
		//System.out.println(revstr);
		if(str.equalsIgnoreCase(revstr))
			
			System.out.println("Given String is Pallindrome");
		else
			System.out.println("Given String is not Pallindrome");
	}

}
