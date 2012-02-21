package net.gageot.puzzler;

import java.util.*;

/**
 * A Strange Saga of a Suspicious Sort.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/library-puzzlers/ch07lev1sec10
 */
public class Puzzle065 {
	private Puzzle065() {
	}

	public static void bug() {
		Random rnd = new Random();
		Integer[] arr = new Integer[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt();
		}

		Comparator<Integer> cmp = new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i2 - i1;
			}
		};
		Arrays.sort(arr, cmp);
		Utils.print(order(arr));
	}

	public static void fixed() {
		Random rnd = new Random();
		Integer[] arr = new Integer[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt();
		}

		Arrays.sort(arr, Collections.reverseOrder());
		Utils.print(order(arr));
	}

	enum Order {ASCENDING, DESCENDING, CONSTANT, UNORDERED}

	static Order order(Integer[] a) {
		boolean ascending = false;
		boolean descending = false;

		for (int i = 1; i < a.length; i++) {
			ascending |= (a[i] > a[i - 1]);
			descending |= (a[i] < a[i - 1]);
		}

		if (ascending && !descending) {
			return Order.ASCENDING;
		}
		if (descending && !ascending) {
			return Order.DESCENDING;
		}
		if (!ascending) {
			return Order.CONSTANT;
		}
		return Order.UNORDERED;
	}
}
