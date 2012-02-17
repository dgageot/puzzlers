package net.gageot.puzzler;

import java.util.*;

/**
 * It's Elementary.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/expressive-puzzlers/ch02lev1sec4
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
