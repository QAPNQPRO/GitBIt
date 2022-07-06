package practice_1;

public class Fibonnaci_Practice {

	public static void main(String[] args) {
		// 0 1 1 2 3 5 8 13 21 34 55......
		int a=0,b=1,c;
		int temp=0;
		System.out.println(a);
		System.out.println(b);
		
		while(temp<8) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			temp=temp+1;
		}
		

	}

}
