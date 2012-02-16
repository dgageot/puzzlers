package net.gageot.puzzler;

import java.math.*;

/**
 * Time for a Change.<br/>
 * http://www.dartlang.org/articles/puzzlers/chapter-1.html#2
 */
public final class Puzzle002 {
	private Puzzle002() {
	}

	public static void print() {
		System.out.println(2.00 - 1.10);
	}

	public static void printFixed() {
		System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
	}
}
