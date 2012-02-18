package net.gageot.puzzler;

/**
 * Looper Meets the Wolfman.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec10
 */
public final class Puzzle033 {
	private Puzzle033() {
	}

	public static void bug() {
		int i = Integer.MIN_VALUE;

		while (i == -i && i != 0) {
		}
	}
}
