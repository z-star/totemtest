package org.cloud.test.c3;

public class OrderNum {

	public static int maxSum(int[] s, int a) {
		int sum = 0;
		int b = 0;
		for (int i = 0; i < a; i++) {
			if (b < 0) {
				b = s[i];
			} else {
				b += s[i];
			}
			if (sum < b) {
				sum = b;
			}
		}
		return sum;
	}

	public static void selectSort(int[] s) {
		for (int i = 0; i < s.length; i++) {
			int m = i;
			for (int j = i + 1; j < s.length; j++) {
				if (s[m] < s[j]) {
					m = j;
				}
			}
			if (m != i) {
				int n;
				n = s[i];
				s[i] = s[m];
				s[m] = n;
			}
		}
	}

	public static void injectionSort(int[] s) {
		for (int i = 1; i < s.length; i++) {
			int tmp = s[i];
			int j = i - 1;
			while (tmp < s[j]) {
				s[j + 1] = s[j];
				j--;
				if (j == -1)
					break;
			}
			s[j + 1] = tmp;
		}
	}

	public static void quickSort(int[] s, int left, int right) {
		if (left < right) {
			int s1 = s[left];
			int i = left;
			int j = right + 1;
			while (true) {
				while (i + 1 < s.length && s[++i] < s1)
					;
				while (j - 1 > -1 && s[--j] > s1)
					;
				if (i >= j)
					break;
				swap(s, j, i);
			}
			s[left] = s[j];
			s[j] = s1;
			quickSort(s, left, j - 1);
			quickSort(s, j + 1, right);

		}

	}

	private static void swap(int[] number, int j, int i) {
		int t;
		t = number[i];
		number[i] = number[j];
		number[j] = t;
	}

	public static void main(String[] args) {
		int[] s = { 1, -2, 3, 10, -4, 7, 2, -5 };
		// OrderNum.selectSort(s);
		// OrderNum.injectionSort(s);
		quickSort(s, 0, 7);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + ",");
		}
		System.out.println();
		System.out.println(OrderNum.maxSum(s, 8));
	}

}
