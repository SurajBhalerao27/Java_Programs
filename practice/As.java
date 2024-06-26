package practice;

import static java.lang.Math.PI; // this is the ex of the static import.

public class As extends ClassLoader implements InterDemo {
	public int a;

	public static void main(String[] args) {
		int i = 0;
		int j = i;
		j = ++i + ++j;
		System.out.println(i + "-" + j);
		System.out.printf("%.2f", PI * 3);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Printing from interface");
	}
}
