package net.gageot.puzzler;

/**
 * Curse of Looper.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec9
 */
public final class Puzzle032 {
	private Puzzle032() {
	}

	public static void bug() {
		Integer i = new Integer(0);
		Integer j = new Integer(0);

		while (i <= j && j <= i && i != j) {
		}
	}
}
