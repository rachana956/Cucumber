package org.interviewprep;

import java.util.Arrays;

public class ArrayAddiungElement {

	public static void main(String[] args) {

		int index = 2;

		String s = "rachana";

		String[] a = { "hi", "hello", "how", "are", "you" };

		String[] b = new String[a.length + 1];

		for (int i = 0; i < b.length; i++) {

			if (i < index) {

				b[i] = a[i];
			} else if (i == index) {

				b[i] = s;

			} else {

				b[i] = a[i - 1];
			}

		}
		System.out.println(Arrays.toString(b));
	}
}
