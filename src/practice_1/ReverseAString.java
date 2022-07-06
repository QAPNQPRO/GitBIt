package practice_1;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str = "sun"; //nus
		
		char ch;
		String newstr="";
		for (int i =0;i<str.length();i++) {
			
			ch = str.charAt(i);//n
			
			newstr=ch+newstr; // newstr = "n"+"us";-->"nus"
			
			
		}
		System.out.println(newstr);
		
		
	}

}
