package com.healthasyst.dayone;

public class OddAndEven {
	public static void main(String[] args) {

		int a = 0;

		System.out.println("Printing using For Loop");
		for (int i = 0; i <= 30; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is a Even Number");
			} else {
				System.out.println(i + " is a Odd Number");
			}
		}

		System.out.println("\n\n\n Printing using While Loop \n");

		while (a <= 30) {
			a++;
			if (a % 2 == 0) {
				System.out.println(a + " is a Even Number");
			} else {
				System.out.println(a + " is a Odd Number");
			}
		}
	}
}
