package practice;
public class Main {
	public static void main(String[] args) {
		
		String address = "Delhi ada,my,sd,India";
		if (address.endsWith("India")) {
			if (address.contains("Meerut")) {
				System.out.println("Your city is Meerut");
			} else if (address.contains("Noida")) {
				System.out.println("Your city is Noida");
			} else {
				System.out.println(address.split(",")[2]);
			}
		} else {
			System.out.println("You are not living in India");
		}
	}
}
