package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		// just to add few numbers in the list
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				list.add(i);
			} else {
				Integer integer = (int) (Math.random() * (80 - 10) + 11);
				list.add(integer);
			}
		}

		// This is sorting in the asc order of the elements.
		Collections.sort(list);
		System.out.println(list);

		//This is to sort the list in the desc order.
		Collections.reverse(list);
		System.out.println(list);
	}
}
