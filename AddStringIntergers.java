package com.StringsPractice;

import java.util.Scanner;

public class AddStringIntergers	{

	 static int calcSum(String str)  {  
	
	     String temp = "0";  
	     int sum = 0;  
	
	     for(int i = 0; i < str.length(); i++)  
	     {  
	         char ch = str.charAt(i); 
	 
	         if (Character.isDigit(ch))  
	             temp += ch;  
	  
	         else{  
	  
	             sum += Integer.parseInt(temp);  
	             
	             temp = "0";  
	         }  
	     }  
	    
	     return sum + Integer.parseInt(temp);  
	 }  
	   
	 public static void main (String[] args) { 
	    
		 Scanner sc =  new Scanner(System.in);
		 System.out.println("Enter a String");
		 
	     String str;
	     str=sc.nextLine();
	   
	     System.out.println(calcSum(str)); 
	 }
}