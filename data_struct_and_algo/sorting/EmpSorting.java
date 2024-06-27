package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class CoustomSorting implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {

		// write on which basis you wants to compare the objects.
		// here I sorted on the <ages>
		return o1.getAge() - o2.getAge();
	}
}
public class EmpSorting {
	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1, "CoderYT", 25, 65000l));
		empList.add(new Employee(3, "Suraj", 24, 85000l));
		empList.add(new Employee(2, "Gaming", 20, 25000l));
		empList.add(new Employee(5, "Poms", 23, 95000l));

		// by using the implementation of the Comparator interface
//		CoustomSorting coustomSorting = new CoustomSorting();
//		Collections.sort(empList, coustomSorting); // sorts in asc order
//
//		System.out.println(empList);




		// Using the Anonymous class
//		Collections.sort(empList, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return (int) (o1.getSalary() - o2.getSalary()); // sort in asc order of salaries.
//			}
//		});
//
//		System.out.println(empList);



		// now using the lambda expression
		Collections.sort(empList, (o1,o2)-> o2.getId() - o1.getId()); // sort id in desc order
		System.out.println(empList);
	}
}
