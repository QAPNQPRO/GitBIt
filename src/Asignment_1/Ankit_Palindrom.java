package Asignment_1;

import java.util.Scanner;

public class Ankit_Palindrom {
	
	public static void main(String[] args) {

		//how to find number is palidrome or not

//		 Scanner sc= new Scanner(System.in);
//		
//		 System.out.println("enter number here");
//		
//		 int num= sc.nextInt();
//		
//		 int org_num=num;
//		
//		 int rev=0;
//		
//		 while(num!=0) {
//		
//		 rev= rev*10 + num%10;  // 0*10 + 1234%10= 0+4= 4
//		 num= num/10;  // 1234/10= 123
//		
//		 }
//		
//		 if(org_num==rev) {
//		
//		 System.out.println("num is palindrome  " + rev);
//		
//		 } else
//		
//		 {
//		 System.out.println("num is not palidrome  " + rev);
//		
//		 }
//		


		//how to find string is palidrome or not

		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter new string");
		 
		 String str= sc.next();
		 String org_str=str;
		 
		 String rev= "";
		 
		 int length= str.length();
		 
		 for(int i=length-1 ; i>=0 ; i--)
		 {
			 rev= rev+str.charAt(i);
		 }
		 
		 if(org_str.equals(rev)) {
		 
			 System.out.println("string is palidrome");
		 } 
		 else {
		 
		 System.out.println("its not");
		 }
		 
		 

		}

}


