package net.gageot.puzzler;

/**
 * Exhausting Workout.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/exceptional-puzzlers/ch05lev1sec10
 */
public final class Puzzle045 {
	private Puzzle045() {
	}

	public static void bug() {
		workHard();
		Utils.print("It's nap time.");
	}

	private static void workHard() {
		try {
			workHard();
		} finally {
			workHard();
		}
	}
}
