package org.cloud.test.c5;

import java.util.ArrayList;


public class Prime {

	// 2到开放的数 都没法与自身整除 就是素数
	public static boolean isPrime(int i) {
		boolean flag = true;
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				flag = false;
			}
		}
		return flag;

	}

	// 完数 能与自身整除的所有数相加 等于自生
	public static boolean wanShu(int i) {
		boolean flag = false;
		int sum = 0;
		for (int j = 1; j <= i / 2; j++) {
			if (i % j == 0) {
				sum += j;
			}
		}
		if (sum == i)
			flag = true;
		return flag;
	}

	public static boolean everPrime(int i) {
		boolean flag = true;
		for (int j = i - 1; j > 1; j--) {
			if (i % j == 0) {
				flag = false;
			}
		}
		return flag;

	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for (int i = 14; i < 50; i++) {
			if (isPrime(i))
				list.add(i);
		}

		for (int i = 1; i < 1000; i++) {
			if (wanShu(i))
				list2.add(i);
		}
		for (Integer s : list2) {
			System.out.println(s);
		}

	}

}
