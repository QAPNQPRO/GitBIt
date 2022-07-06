package Asignment_1;

import java.util.Scanner;

public class Rutuja_Prime_no {
	private static Scanner s;

	public static void main(String[] args) {
		int num, i, count=0;
		s = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		num = s.nextInt();
		
		for(i=2; i<num ;i++)
		{
			if(num%i == 0)
			{
				count++;
				break;
			}
		}
		if (count==0)
			System.out.println(num  + "  is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
}
