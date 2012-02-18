package net.gageot.puzzler;

/**
 * Inclement Increment.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec2
 */
public final class Puzzle025 {
	private Puzzle025() {
	}

	public static void bug() {
		int j = 0;
		for (int i = 0; i < 100; i++) {
			j = j++;
		}
		Utils.print(j);
	}

	public static void fixed() {
		int j = 0;
		for (int i = 0; i < 100; i++) {
			j++;
		}
		Utils.print(j);
	}
}
