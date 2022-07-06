package practice_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SecondLargestInArray {

	
	//Arrays, Collections, Character
	public static void main(String[] args) {
		Integer intarr[] = {1,8,3,4,9,6,7};
		System.out.println(Arrays.toString(intarr));
		Arrays.sort(intarr);
		System.out.println(Arrays.toString(intarr));
		System.out.println(intarr[intarr.length-2]);
		List<Integer> fi = new ArrayList<>(Arrays.asList(1,6,8,2,9)); 
		Collections.sort(fi, Collections.reverseOrder());
		
		Set<Integer> ti = new HashSet(Arrays.asList(1,6,8,2,9));
		
//		List, Set, Maps... ArrayList.. Arrays.
		
		
		
	}

}
