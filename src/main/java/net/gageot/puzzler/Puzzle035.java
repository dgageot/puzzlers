package net.gageot.puzzler;

/**
 * Minute by Minute.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec12
 */
public final class Puzzle035 {
	private Puzzle035() {
	}

	public static void bug() {
		int minutes = 0;
		for (int ms = 0; ms < 60 * 60 * 1000; ms++) {
			if (ms % 60 * 1000 == 0) {
				minutes++;
			}
		}
		Utils.print(minutes);
	}

	private static final int MS_PER_HOUR = 60 * 60 * 1000;
	private static final int MS_PER_MINUTE = 60 * 1000;

	public static void fixed() {
		int minutes = 0;
		for (int ms = 0; ms < MS_PER_HOUR; ms++) {
			if (ms % MS_PER_MINUTE == 0) {
				minutes++;
			}
		}
		Utils.print(minutes);
	}
}
