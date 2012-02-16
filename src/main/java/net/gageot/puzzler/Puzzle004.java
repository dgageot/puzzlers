package net.gageot.puzzler;

import java.util.*;

/**
 * It's Elementary.<br/>
 * http://www.dartlang.org/articles/puzzlers/chapter-1.html#4
 */
public final class Puzzle004 {
	private Puzzle004() {
	}

	public static void print() {
		Utils.print(12345 + 5432l);
	}

	public static void printFixed() {
		Utils.print(12345 + 5432L);
	}

	public static void badCode() {
		List<String> l = new ArrayList<String>();
		l.add("Foo");

		Utils.print(l);
	}
}
