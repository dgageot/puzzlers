package net.gageot.puzzler;

/**
 * Looper.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec5
 */
public final class Puzzle028 {
	private Puzzle028() {
	}

	public static void bug() {
		double i = Double.POSITIVE_INFINITY;

		while (i == i + 1) {
		}
	}
}
