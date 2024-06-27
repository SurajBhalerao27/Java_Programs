package lists;

import java.util.ArrayList;
import java.util.List;

public class AddAllMethod {
	public static void main(String[] args) {
		List<Integer> fist = new ArrayList<>();
		fist.add(3);
		fist.add(5);
		fist.add(7);

		List<Integer> all = new ArrayList<>(fist);

		List<Integer> next = new ArrayList<>();
		next.add(9);
		next.add(13);
		next.add(19);

		all.addAll(next); // here we add the all elements to the new list and which already have one list

		System.out.println(all);
	}
}
