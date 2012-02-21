package net.gageot.puzzler;

import java.util.*;

/**
 * What’s the Difference?<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/library-puzzlers/ch07lev1sec4
 */
public class Puzzle059 {
	private Puzzle059() {
	}

	public static void bug() {
		int[] vals = { //
				789, 678, 567, 456, //
				345, 234, 123, 012};
		Set<Integer> diffs = new HashSet<Integer>();

		for (int i = 0; i < vals.length; i++) {
			for (int j = i; j < vals.length; j++) {
				diffs.add(vals[i] - vals[j]);
			}
		}
		Utils.print(diffs.size());
	}

	public static void fixed() {
		int[] vals = { //
				789, 678, 567, 456, //
				345, 234, 123, 12};
		Set<Integer> diffs = new HashSet<Integer>();

		for (int i = 0; i < vals.length; i++) {
			for (int j = i; j < vals.length; j++) {
				diffs.add(vals[i] - vals[j]);
			}
		}
		Utils.print(diffs.size());
	}
}
