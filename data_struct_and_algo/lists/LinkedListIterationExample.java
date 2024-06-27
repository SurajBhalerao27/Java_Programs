package lists;

import java.util.LinkedList;

public class LinkedListIterationExample {
	public static void main(String[] args) {
		LinkedList<String> progLang = new LinkedList<>();
		progLang.add("C");
		progLang.add("C++");
		progLang.add("C#");
		progLang.add("JAVA");
		progLang.add("PYTHON");
		progLang.add("JAVASCRIPT");

		// find out the given element is present in list or not
		boolean result = progLang.contains("C#");
		System.out.println(result);

		// Find the index of given elements
		int idx = progLang.indexOf("JAVA");
		System.out.println(idx);

		// Iterations over the linkedList.

//		for (String language : progLang) {
//		}

		System.out.println();
		// forEach
//		progLang.forEach((langs) -> System.out.print(langs + " "));

		System.out.println();
		// for each advanced loop
		for (String language : progLang) {
			System.out.print(language + " ");
		}

		System.out.println();
		// simple for loop
		for (String language : progLang) {
			System.out.print(language + " ");
		}
	}
}
