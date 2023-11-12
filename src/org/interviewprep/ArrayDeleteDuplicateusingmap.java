package org.interviewprep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ArrayDeleteDuplicateusingmap {

	public static void main(String[] args) {

		String[] a = { "hi", "hello", "how", "are", "you", "hi", "hello" };

		Map<String, Integer> m = new LinkedHashMap<>();

		int count = 0;
		for (String string : a) {

			m.put(string, count);

		}

		System.out.println(m.keySet());

	}
}
