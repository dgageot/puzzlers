package net.gageot.puzzler;

/**
 * In the Loop.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec3
 */
public final class Puzzle026 {
	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;

	private Puzzle026() {
	}

	public static void bug() {
		int count = 0;
		for (int i = START; i <= END; i++) {
			count++;
		}
		Utils.print(count);
	}

	public static void fixed() {
		int count = 0;
		for (long i = START; i <= END; i++) {
			count++;
		}
		Utils.print(count);
	}
}
