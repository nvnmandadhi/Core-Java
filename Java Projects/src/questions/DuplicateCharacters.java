package questions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		String obj = "aaaabbbbbbbbbnnnnnndddddddddddd";
		printDuplicates(obj);
	}

	private static void printDuplicates(String obj) {

		Map<Character, Integer> map = new HashMap<>();
		char[] characters = obj.toCharArray();

		for (char ch : characters) {
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		/*
		 * Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		 * 
		 * for (Map.Entry<Character, Integer> entry : entrySet) { if
		 * (entry.getValue() > 1) { System.out.printf("%s : %d %n",
		 * entry.getKey(), entry.getValue()); } }
		 */

	}

}
