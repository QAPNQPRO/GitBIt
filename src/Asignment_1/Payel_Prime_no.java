package Asignment_1;

import java.util.Scanner;

public class Payel_Prime_no {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.println("user input");
	        System.out.println ("Enter Number:");
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        boolean flag = false;
	        for (int i = 2; i <= num / 2; ++i) {
	          // condition for nonprime number
	          if (num % i == 0) {
	            flag = true;
	            break;
	          }
	        }

	        if (!flag)
	          System.out.println(num + " is a prime number.");
	        else
	          System.out.println(num + " is not a prime number.");
	      }
}
