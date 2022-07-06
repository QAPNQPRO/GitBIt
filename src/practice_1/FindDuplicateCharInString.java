package practice_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharInString {

	public static void main(String[] args) {
		
		String str = "MISSISIPI";
		
		char[] charStr = str.toCharArray();
		
		Set<Character> ch = new HashSet<Character>();
		
		for(int i=0;i<charStr.length;i++) {
			
			ch.add(charStr[i]);
			
		}
		
		System.out.println(Arrays.toString(charStr));
		System.out.println(ch.toString());
	
		int count=0;
		
		for(Character s:ch) {
			for(int i=0;i<charStr.length;i++) {
				if(s.compareTo()) {
					count=count+1;
				}
				
			}
			
			
		}
	}

}
