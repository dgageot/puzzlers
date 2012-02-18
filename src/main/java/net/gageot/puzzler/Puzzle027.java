package net.gageot.puzzler;

/**
 * Shifty i’s.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec4
 */
public final class Puzzle027 {
	private Puzzle027() {
	}

	public static void bug() {
		int i = 0;
		while (-1 << i != 0) {
			i++;
		}
		Utils.print(i);
	}

	public static void fixed() {
		int i = 0;
		for (int val = -1; val != 0; val <<= 1) {
			i++;
		}
		Utils.print(i);
	}
}
