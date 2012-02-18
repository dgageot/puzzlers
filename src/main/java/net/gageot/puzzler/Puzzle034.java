package net.gageot.puzzler;

/**
 * Down for the Count.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec11
 */
public final class Puzzle034 {
	private Puzzle034() {
	}

	private static final int START = 2000000000;

	public static void bug() {
		int count = 0;
		for (float f = START; f < START + 50; f++) {
			count++;
		}
		Utils.print(count);
	}

	public static void fixed() {
		int count = 0;
		for (int f = START; f < START + 50; f++) {
			count++;
		}
		Utils.print(count);
	}
}
