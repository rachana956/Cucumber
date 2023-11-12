package org.interviewprep;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicateDelusingset {

	public static void main(String[] args) {

		String[] s = { "hi", "how", "are", "you", "hi", "you" };

		Set<String> s1 = new LinkedHashSet<>();

		int count = 0;

		for (String string : s) {

			s1.add(string);

		}

		System.out.println(s1);

	}

}
