package lambda;

import java.util.Scanner;

public class StringReverse {
	public static String reverseString(String s){
		return new StringBuilder(s).reverse().toString();
		
	}
public static boolean palindrome(String s)
{
	return (s.equals(reverseString(s))?true:false) ;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringReverse s1 = new StringReverse();
Scanner scan = new Scanner(System.in);
System.out.println("enter input");
  String input = scan.nextLine();
 // System.out.println(input);
  System.out.println(reverseString(input));
  System.out.println(palindrome(input));
  
	}

}
