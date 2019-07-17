import java.util.Scanner;

public class StringSeperation {
	
	public static void main(String args[]) { 
	    	// TODO Auto-generated method stub
	        String str; 
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the String");
	        str = sc.nextLine();
		    StringBuffer alphabets = new StringBuffer(),  
		    numbers = new StringBuffer(), 
		    specialChars = new StringBuffer(); 
		          
		    for (int i=0; i<str.length(); i++) { 
		    	
		    	if(Character.isAlphabetic(str.charAt(i))) 
		            alphabets.append(str.charAt(i));    
		    	  
		        else if(Character.isDigit(str.charAt(i))) 
		    		numbers.append(str.charAt(i));
		        
		        else
		            specialChars.append(str.charAt(i)); 
		    } 
		       
		        System.out.println(alphabets); 
		        System.out.println(numbers); 
		        System.out.println(specialChars);
	} 
}
