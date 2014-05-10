package org.cloud.test.c4;

public class HeapSortTest {

	public static void main(String[] args) {
		int[] s = new int[] { 1, 6, -3, 15, 24, 55, 13, 20, 5, 77, 43 };
		state(s);
		sort(s);
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i]);
		}
	}

	public static void sort(int[] s) {
		for (int i = s.length - 1; i >= 0; i--) {
			int temp = s[0];
			s[0]=s[i];
			s[i]=temp;
			BuildHeap(s, i, 0);

		}
	}

	public static void state(int[] s) {
		int index = findindex(s.length - 1);
		for (int i = index; i >= 0; i--) {
			BuildHeap(s, s.length, i);
		}

	}

	public static void BuildHeap(int[] s, int length, int index) {
		int lift = readLift(index);
		int right = readRight(index);
		int retemp = index;
		if (lift < length && s[index] < s[lift]) {
			retemp = lift;
		}
		if (right < length && s[retemp] < s[right]) {
			retemp = right;
		}
		if (retemp != index) {
			int temp = s[index];
			s[index] = s[retemp];
			s[retemp] = temp;
			BuildHeap(s, length, retemp);
		}

	}

	public static int readLift(int s) {
		return (s << 1) + 1;
	}

	public static int readRight(int s) {
		return (s << 1) + 2;
	}
	public static int findindex(int length) {
		int index = (length - 1) >> 1;
		return index;
	}

}
