package List;

import java.util.*;
public class Remove_DuplicatesHashSet {
	public static void main(String[] args) {
		List<Integer>number = Arrays.asList(1,2,2,3,4,4,5,1,3);
		System.out.println("Original List with Duplicate " + number);
		 
		Set<Integer> uniqueSet = new HashSet<>(number);
		
		List<Integer> uniqueList = new ArrayList<>(uniqueSet);
		System.out.println("List After Removing Duplicate " + uniqueList);
	}

}
