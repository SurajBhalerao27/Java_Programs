package practice;

import java.util.Scanner;

/*  This is the way by which we are able to declare the variables at the top so that we can able to access them
    globally. and one inner static class with a static method in it which is created with the execution of the program
    and this method is used for creating new objects  ---- this method leads to the create problems in future where the 
    program is gets bigger
*/

//public class ObjectCreationWithStaticClass{
//    static Scanner scanner;
//    static StringBuilder sb;
//
//    static class Obj {
//        static void creation() {
//            scanner = new Scanner(System.in);
//            sb = new StringBuilder();
//        }
//    }
//
//    public static void main(String[] args) {
//        // Call the static method to initialize the static variables
//        Obj.creation();
//        System.out.println("Enter A Num: ");
//        int a = scanner.nextInt();
//        System.out.println("Square of " + a + " is: " + (a * a));
//    }
//}


/*  better design pattern, especially for larger applications, is to use dependency injection. Instead of using static variables and methods, 
 * you can pass dependencies (like Scanner) to methods or constructors explicitly. This improves testability and maintainability.
 */

public class ObjectCreationWithStaticClass {
	static class Obj {
		Scanner scanner;
		StringBuilder sb;

		Obj(Scanner scanner, StringBuilder sb) {
			this.scanner = scanner;
			this.sb = sb;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		Obj obj = new Obj(scanner, sb);
		System.out.println("Enter A Num: ");
		int a = obj.scanner.nextInt();
		System.out.println("Square of " + a + " is " + (a * a));
		scanner.close();
	}
}