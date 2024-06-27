package lists;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {
	public static void main(String[] args) {
		List<String> topProgLang = new ArrayList<>();
		topProgLang.add("C");
		topProgLang.add("JAVA");
		topProgLang.add("PYTHON");
		topProgLang.add(".NET");

		/****
		 Below there are different ways to print the list
		 ****/

		// 1
//		System.out.println(
//				"Empty or Not -> " + topProgLang.isEmpty() +
//				"\nSize is -> " + topProgLang.size()+
//				"\nBest Prog Lang -> " + topProgLang.get(1) +
//				"\n.NET to C#-> " + topProgLang.set(3, "C#"));


		//2
//		for (Iterator iterator = topProgLang.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
//			System.out.print(string + ", ");
//		}


		//3
//		Iterator it = topProgLang.iterator();
//		while (it.hasNext()) {
//			String tpl = (String) it.next();
//			System.out.println(tpl);
//		}


		//4
//		topProgLang.stream().forEach(tpl-> System.out.println(tpl));


		//5
//		topProgLang.forEach((tpl)->System.out.println(tpl));
	}

}
