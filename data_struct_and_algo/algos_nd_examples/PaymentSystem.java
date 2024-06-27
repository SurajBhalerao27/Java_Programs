package algos_nd_examples;

interface PaymentMethod {
	public void pay();
}

class DebitCard implements PaymentMethod {
	@Override
	public void pay() {
		System.out.println("Paying via Debit Card ...");
	}
}

class CreditCard implements PaymentMethod {
	@Override
	public void pay() {
		System.out.println("Paying via Credit Card ...");
	}
}

class UPI implements PaymentMethod {
	@Override
	public void pay() {
		System.out.println("Paying via UPI ...");
	}
}

public class PaymentSystem {
	public static void main(String[] args) {
		PaymentMethod pm = new DebitCard();
		PaymentMethod pm2 = new CreditCard();
		PaymentMethod pm3 = new UPI();

		pm.pay();
		pm2.pay();
		pm3.pay();
	}
}
