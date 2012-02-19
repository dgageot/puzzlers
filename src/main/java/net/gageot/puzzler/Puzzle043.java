package net.gageot.puzzler;

/**
 * Exceptionally Unsafe.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/exceptional-puzzlers/ch05lev1sec8
 */
public final class Puzzle043 {
	private Puzzle043() {
	}

	public static void bug(Throwable t) {
		Thread.currentThread().stop(t); // Deprecated!!
	}
}
