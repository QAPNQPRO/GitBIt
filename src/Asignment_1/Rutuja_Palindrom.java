package Asignment_1;

import java.util.Scanner;

public class Rutuja_Palindrom {
	
	private static Scanner s;
	public static void main(String[] args) {
		String a,b = "";
		s = new Scanner(System.in);
		System.out.println("Enter the string:");
		a = s.nextLine();
		int n = a.length();
		for (int i=n-1; i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println(b + " is a Palindrome");
		}
		else
		{
			System.out.println(b + " is not a Palindrome");
		}

	}

}
