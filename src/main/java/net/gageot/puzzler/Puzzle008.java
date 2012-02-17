package net.gageot.puzzler;

/**
 * Dos Equis.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/expressive-puzzlers/ch02lev1sec8
 */
public final class Puzzle008 {
	private Puzzle008() {
	}

	public static void bug() {
		char x = 'X';
		int i = 0;
		Utils.print(true ? x : 0);
		Utils.print(false ? i : x);
	}
}
