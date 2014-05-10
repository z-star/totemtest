package org.cloud.test.c2;

public class Stock {

	private int head;
	private int[] s = new int[1024];
	private int min;

	public int pop() {
		if (head <= 0) {
			return 0;
		}
		int value = s[head];
		head--;
		return value;
	}

	public void push(int value) {
		head++;
		s[head] = value;
		if (value < min) {
			min = value;
		}
	}

}
