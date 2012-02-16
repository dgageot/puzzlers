package net.gageot.puzzler;

/**
 * Dos Equis.<br/>
 * http://www.dartlang.org/articles/puzzlers/chapter-1.html#8
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
