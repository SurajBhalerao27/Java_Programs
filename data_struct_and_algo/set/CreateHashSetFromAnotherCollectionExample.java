package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromAnotherCollectionExample {
	public static void main(String[] args) {
		Set<Integer> firstFiveEvenNumbers = new HashSet<>();
		Set<Integer> nextFiveEvenNumbers = new HashSet<>();

		for (int i = 1, j = 11; i <= 10 && j <= 20; i++, j++) {
			if (i % 2 == 0 || j % 2 == 0) {
				firstFiveEvenNumbers.add(i);
				nextFiveEvenNumbers.add(j);
			}
		}

		// creating different collections class obj here
		List<Integer> allEvenNumbers = new ArrayList<>();


		/*
		   We can add two different collections to each other
		   like here we add sets in to the list object.
		 */
		allEvenNumbers.addAll(firstFiveEvenNumbers);
		allEvenNumbers.addAll(nextFiveEvenNumbers);

		System.out.println(allEvenNumbers);
	}
}
