package lists;

import java.util.LinkedList;

public class RemoveElementsFromLinkedList {
	public static void main(String[] args) {
		LinkedList<String> fruitList = new LinkedList<>();
		fruitList.add("Banana");
		fruitList.add("Pineapple");
		fruitList.add("Manogo");
		fruitList.add("Cherrry");
		fruitList.add("Pineapple");
		fruitList.add("Cherrry");
		fruitList.add("Strawberry");

		// Printing all the list
		System.out.println("All Fruits: " + fruitList);

		// Removing the first element from the list
		fruitList.removeFirst();
		System.out.println("After removing first fruit: " + fruitList);

		// Removing the last element from the list.
		fruitList.removeLast();
		System.out.println("After removing last fruit: " + fruitList);

		//
		boolean removed = fruitList.removeFirstOccurrence("Cherrry");
		System.out.println("Removed first occurance from the list? " + removed);
		System.out.println(fruitList);
	}
}
