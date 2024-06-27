package lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(1, 8);
		list.addFirst(0);
		list.addLast(9);

		System.out.println(list);
	}
}
