package net.gageot.puzzler;

/**
 * Oddity.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/expressive-puzzlers/ch02lev1sec1
 */
public final class Puzzle001 {
	private Puzzle001() {
	}

	public static boolean isOdd(int i) {
		return i % 2 == 1;
	}

	public static boolean isOddFixed(int i) {
		return i % 2 != 0;
	}

	public static boolean isOddFixedAndFaster(int i) {
		return (i & 1) != 0;
	}
}
