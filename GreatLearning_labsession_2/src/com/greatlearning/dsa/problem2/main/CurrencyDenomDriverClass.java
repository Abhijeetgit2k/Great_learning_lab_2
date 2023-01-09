package com.greatlearning.dsa.problem2.main;

import java.util.*;

import com.greatlearning.dsa.problem2.service.CurrencyDenomLogic;
import com.greatlearning.dsa.problem2.service.MergeSortImplementation;

public class CurrencyDenomDriverClass {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);

		System.out.println("enter the size of currency denominations");
		int size = s.nextInt();
		System.out.println("enter the currency denominations value");
		int[] curr_value = new int[size];
		for (int i = 0; i < size; i++) {
			curr_value[i] = s.nextInt();
		}

		MergeSortImplementation mergesort = new MergeSortImplementation();
		mergesort.sort(curr_value, 0, size - 1);

		System.out.println("enter the amount you want to pay");
		int amount = s.nextInt();

		System.out.println();

		CurrencyDenomLogic notes = new CurrencyDenomLogic();

		notes.denomination(size, curr_value, amount);

	}
}
