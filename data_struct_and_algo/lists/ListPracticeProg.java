package lists;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeProg {
	public static void main(String[] args) {
		List<String> list  = new ArrayList<>();
		list.add("Suraj");



		for(String s : list) {
			System.out.println(s);
		}
	}
}
