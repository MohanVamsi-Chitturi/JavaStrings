package com.StringsPractice;

import java.util.Scanner;

public class ExtractIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="";
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the String with numbers and characters");
		 str=sc.nextLine();
		 String num= str.replaceAll("[^0-9]", "");
		 System.out.println(num);
	}

}