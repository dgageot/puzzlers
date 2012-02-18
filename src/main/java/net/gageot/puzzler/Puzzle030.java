package net.gageot.puzzler;

/**
 * Son of Looper.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec7
 */
public final class Puzzle030 {
	private Puzzle030() {
	}

	public static void bug() {
		String i = "Buy seventeen copies of Effective Java!";

		while (i != i + 0) {
		}
	}
}
