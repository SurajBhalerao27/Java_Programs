package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
//		Set<Integer> set = new HashSet<Integer>(new LinkedHashSet<Integer>(Arrays.asList(8,7,8,4,3,6,9,6,10,94)));

		/* I created the about part to just fun and play around with the implementation of the set, HashSet and LinkedHashSet */
		Set<String> progLangs = new HashSet<>();
		progLangs.add("C");
		progLangs.add("C++");
		progLangs.add("JAVA");
		progLangs.add("PYTHON");
		progLangs.add("JAVASCRIPT");
		progLangs.add("NODE JS");

		System.out.println(progLangs);

		// Trying to add duplicate values
		/* it does not allow duplicate values*/
		progLangs.add("JAVA");
		System.out.println(progLangs);

	}
}
