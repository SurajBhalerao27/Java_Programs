package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfListPractice {
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<>();

		list.add(Arrays.asList(4, 8, 6, 9, 3, 5));
		list.add(Arrays.asList(7, 8, 6, 29, 68, 50));
		list.add(Arrays.asList(74, 668, 98, 5556, 34));

		// to access elements from the list of list then we have to
		// iterate by the for loops
		// *** This prints all elements
//		for (List<Integer> innerList : list) {
//			for (Integer i : innerList) {
//				System.out.print(i + " ");
//			}
//			System.out.println();
//		}


		// if wanted to print specific element from specific list then,
		int specificElement = list.get(2).get(3);
		System.out.println(specificElement);
	}
}
