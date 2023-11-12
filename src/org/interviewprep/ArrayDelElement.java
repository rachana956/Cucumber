package org.interviewprep;

import java.util.Arrays;

public class ArrayDelElement {

	public static void main(String[] args) {

		int[] a = { 22, 44, 66, 88, 99 };

		int[] b = new int[a.length - 1];

		for (int i = 0; i <=b.length; i++) {

			if (i < 2) {

				b[i] = a[i];

			} else if (i == 2) {

				continue;
			} else {

				b[i - 1] = a[i];
			}

			
		}
System.out.println(Arrays.toString(b));
	}

}
