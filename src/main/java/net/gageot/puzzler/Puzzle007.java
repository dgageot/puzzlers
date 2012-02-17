package net.gageot.puzzler;

/**
 * Swap Meat.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/expressive-puzzlers/ch02lev1sec7
 */
public final class Puzzle007 {
	private Puzzle007() {
	}

	public static void bug() {
		int x = 1984; // (0x7c0)
		int y = 2001; // (0x7d1)
		x ^= y ^= x ^= y;

		Utils.print("x = " + x + "; y =" + y);
	}
}
