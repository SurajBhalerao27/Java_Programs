package cwd.lamdaFunction;

public class Main {

	public static void main(String[] args) {
		System.out.println("My System starts...");
		Myinter i = new Myinter() {
			@Override
			public void SayHello() {
				System.out.println("This is first anonymous class");
			}
		};
		i.SayHello();
		Myinter i2 = new Myinter() {
			@Override
			public void SayHello() {
				System.out.println("This is 2nd Anonymous class");
			}
		};
		i2.SayHello();	

		// Using our interface with the help of lambda
		// This is the Lambda Function Example....          || Lambda fuction is the fuction that have ....?  <<   ()->   >>  This is the lambda functions symboll
		Myinter i3 = () -> System.out.println("This is lambda");
		i3.SayHello();

		Myinter j = () -> System.out.println("This is 2nd lambda...!");
		j.SayHello();

		// This is only used in functional interface(interface which have only one
		// method in it and denoted as with annnotation << @FunctionalInterface >> & the method in it is always have abstract class in it)

		// First rule/Type
		SumInter sm = (int a, int b) -> {
			return a + b;
		};

		System.out.println(sm.sum(3, 4));
		System.out.println(sm.sum(2, 1));

		System.out.println();
		// Second Rule /Type
		SumInter sm1 = (a, b) -> a + b;

		System.out.println(sm1.sum(3, 2));
		System.out.println(sm1.sum(2, 8));
		
		System.out.println();
		// String Length using lambda function
		LegthInter ln = (str)->str.length();
		System.out.println("The length of string is : "+ln.getLength("Suraj Bhalerao Java  Developer"));
	}
}
