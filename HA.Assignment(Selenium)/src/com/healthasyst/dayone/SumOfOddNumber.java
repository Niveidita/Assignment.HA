package com.healthasyst.dayone;

//Q5. Write a program which calculates the sum of all odd numbers upto a particular limit.The limit will be an input to the program.

import java.util.Scanner;

public class SumOfOddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a limit in Integer : ");
		int limit = sc.nextInt();
		int sumOfOdd = 0;

		for (int i = 0; i <= limit; i++) {
			if (i % 2 != 0) {
				sumOfOdd = sumOfOdd + i;
			}
		}

		System.out.println("Sum of all the odd numbers within the range is : " + sumOfOdd);

		sc.close();

	}

}