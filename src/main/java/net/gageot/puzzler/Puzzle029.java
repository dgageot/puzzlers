package net.gageot.puzzler;

/**
 * Bride of Looper.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec6
 */
public final class Puzzle029 {
	private Puzzle029() {
	}

	public static void bug() {
		double i = Double.NaN;

		while (i != i) {
		}
	}
}
