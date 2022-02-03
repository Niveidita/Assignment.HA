package com.healthasyst.dayone;

//6. Write a program which takes two integers N and M and produces last samples of N of the integers from N-1 to N-M.

import java.util.Scanner;

public class PrintInBetweenValues {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(" Enter first Integer Value : ");
		int firstValue = sc.nextInt();
		System.out.println(" Enter Second Integer Value : ");
		int secondValue = sc.nextInt();

		for (int i = (firstValue - 1); i >= (firstValue - secondValue); i--) {
			System.out.println(i);
		}

		sc.close();

	}

}