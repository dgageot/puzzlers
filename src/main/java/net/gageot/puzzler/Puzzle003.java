package net.gageot.puzzler;

/**
 * Long Division.<br/>
 * http://www.dartlang.org/articles/puzzlers/chapter-1.html#3
 */
public final class Puzzle003 {
	private Puzzle003() {
	}

	public static void print() {
		final long micros_per_day = 24 * 60 * 60 * 1000 * 1000;
		final long millis_per_day = 24 * 60 * 60 * 1000;

		System.out.println(micros_per_day / millis_per_day);
	}

	public static void printFixed() {
		final long micros_per_day = 24L * 60 * 60 * 1000 * 1000;
		final long millis_per_day = 24L * 60 * 60 * 1000;

		System.out.println(micros_per_day / millis_per_day);
	}
}
