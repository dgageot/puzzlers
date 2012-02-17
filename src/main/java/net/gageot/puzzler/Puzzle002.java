package net.gageot.puzzler;

import java.math.*;

/**
 * Time for a Change.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/expressive-puzzlers/ch02lev1sec2
 */
public final class Puzzle002 {
	private Puzzle002() {
	}

	public static void print() {
		Utils.print(2.00 - 1.10);
	}

	public static void printFixed() {
		Utils.print(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
	}
}
