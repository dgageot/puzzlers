package net.gageot.puzzler;

/**
 * Indecision.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/exceptional-puzzlers/ch05lev1sec1
 */
public final class Puzzle036 {
	private Puzzle036() {
	}

	static boolean decision() {
		try {
			return true;
		} finally {
			return false;
		}
	}
}
