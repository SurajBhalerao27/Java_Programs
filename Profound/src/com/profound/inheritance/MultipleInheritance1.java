package com.profound.inheritance;

public class MultipleInheritance1 implements A, B {
	int a, b;

	@Override
	public void setb(int b) {
		this.b = b;
	}

	@Override
	public void seta(int a) {
		this.a = a;
	}

	void add() {
		System.out.println("Addition is : " + (a + b));
	}

	public static void main(String[] args) {
		MultipleInheritance1 ob = new MultipleInheritance1();
		ob.seta(50);
		ob.setb(20);
		ob.add();
	}

}
