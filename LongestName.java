package com.StringsPractice;

import java.util.Scanner;

public class LongestName {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String name = "";
	    int num;
	    String longName = "";
	    int maxLength = 0;
	    System.out.println("Enter the number of names");
	    num=sc.nextInt();
	    System.out.println("Enter names :");

	    for (int i = 0; i <=num; i++) { 
	        name = sc.nextLine();
	        if (maxLength < name.length()) { 
	            maxLength = name.length();
	            longName = name;              
	        }
	    }
	    System.out.println("Longest name is " + longName); 
	}
}