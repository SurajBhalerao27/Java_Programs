package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CreateHashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> numberMapping = new HashMap<>();

		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three", 33);
		numberMapping.put("Four", 4);
		numberMapping.put("Five", 5);
		numberMapping.put(null, null);// this is not getting
		numberMapping.put(null, 6); // here it is getting null as key
		numberMapping.put("Seven", null); // here it gets null as value as well

		System.out.println(numberMapping);

		// check if empty or not
		System.out.println(numberMapping.isEmpty());

		// checking the size of it
		System.out.println(numberMapping.size());

		// check key exist or not
		if (numberMapping.containsKey("Zero")) {
			System.out.println("Exist");
		} else {
			System.out.println("Not Exists");
		}

		// check value exist or not
		if (numberMapping.containsValue(5)) {
			System.out.println("Exist");
		} else {
			System.out.println("Not Exists");
		}

		// getting value by key
		Integer val = numberMapping.get("Three");
		System.out.println(val);

		// remove keys from hashMap
		numberMapping.remove(null);
		numberMapping.remove("Seven");
		System.out.println(numberMapping);

		// Printing all keys in the HashMap
		System.out.println("All keys: " + numberMapping.keySet());

		// Printing all values in the HashMap
		System.out.println(numberMapping.values() + "\n\n");

		// Ways to iterate over the HashMap
		for (Map.Entry<String, Integer> entries : numberMapping.entrySet()) {
			System.out.println(entries);
		}

		// using iterator on the while loop
		Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
		for (Entry<String, Integer> entry : entries) {
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

		System.out.println("\n\n");

		// by java 8 forEach method
		numberMapping.forEach((K, V) -> {
			System.out.println("Key: " + K + " | " + " Value: " + V);
		});
	}
}
