package net.gageot.puzzler;

/**
 * Escape Rout.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/puzzlers-with-character/ch03lev1sec4
 */
public final class Puzzle014 {
	private Puzzle014() {
	}

	public static void bug() {
		// \u0022 is the Unicode escape for double quote (")
		System.out.println("a\u0022.length() + \u0022b".length());
	}

	public static void fixed() {
		System.out.println("a\".length() + \"b".length());
	}
}
