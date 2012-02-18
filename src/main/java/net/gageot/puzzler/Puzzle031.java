package net.gageot.puzzler;

/**
 * Ghost of Looper.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec8
 */
public final class Puzzle031 {
	private Puzzle031() {
	}

	public static void bug() {
		long i = -1;

		while (i != 0) {
			i >>>= 1;
		}
	}
}
