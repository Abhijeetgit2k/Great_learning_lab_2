package com.greatlearning.dsa.problem1.main;

import com.greatlearning.dsa.problem1.service.Transaction;

import java.util.Scanner;

public class PayMoneyDriverClass {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = sc.nextInt();

		int[] tranc_arr = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			tranc_arr[i] = sc.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int targets = sc.nextInt();

		Transaction transaction = new Transaction();
		transaction.payMoney(size, tranc_arr, targets);

	}

}
