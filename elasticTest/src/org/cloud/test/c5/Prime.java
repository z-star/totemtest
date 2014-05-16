package org.cloud.test.c5;

import java.util.ArrayList;

public class Prime {

	// 2到开放的数 都没法整除 就是素数
	public static boolean isPrime(int i) {
		boolean flag = true;
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				flag = false;
			}
		}
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
		for (int i = 14; i < 50; i++) {
			if (isPrime(i))
				list.add(i);
		}

	}

}
