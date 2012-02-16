package net.gageot.puzzler;

/**
 * Long Division.<br/>
 * http://www.dartlang.org/articles/puzzlers/chapter-1.html#3
 */
public final class Puzzle003 {
	private Puzzle003() {
	}

	public static void print() {
		final long microsPerDay = 24 * 60 * 60 * 1000 * 1000;
		final long millisPerDay = 24 * 60 * 60 * 1000;

		Utils.print(microsPerDay / millisPerDay);
	}

	public static void printFixed() {
		final long microsPerDay = 24L * 60 * 60 * 1000 * 1000;
		final long millisPerDay = 24L * 60 * 60 * 1000;

		Utils.print(microsPerDay / millisPerDay);
	}
}
