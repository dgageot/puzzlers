package net.gageot.puzzler;

/**
 * Exceptionally Arcane.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/exceptional-puzzlers/ch05lev1sec4
 */
public final class Puzzle039 {
	private Puzzle039() {
	}

	public static void bug() {
		try {
			Utils.print("Hello world");
			System.exit(0);
		} finally {
			Utils.print("Goodbye world");
		}
	}

	public static void fixed() {
		Utils.print("Hello world");
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				Utils.print("Goodbye world");
			}
		});
		System.exit(0);
	}
}
