package Asignment_1;

public class Ankit_Prime_no {

	
	public static void main(String[] args) {

		//Find out whether no is prime or not

		int num= 5;
		int count=0;

		if(num>1) {


			for(int i=1 ; i<=num ; i++) {
	
				if(num%i ==0)
					count++;
		
				}
		
				if(count ==2)
				{
					System.out.println("its a prime no");
				}
		
				else {
		
					System.out.println("its not prime no");
				}
	
			}
			else {
	
				System.out.println("its not a prime no");
			}




		}

}
