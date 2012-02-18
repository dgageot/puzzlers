package net.gageot.puzzler;

import java.util.regex.*;

/**
 * What’s My Class?.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/puzzlers-with-character/ch03lev1sec10
 */
public final class Puzzle020 {
	private Puzzle020() {
	}

	public static void bug() {
		System.out.println(Puzzle018.class.getName().replaceAll(".", "/") + ".class");
	}

	public static void fixed() {
		System.out.println(Puzzle018.class.getName().replace("\\.", "/") + ".class");
	}

	public static void fixedQuote() {
		System.out.println(Puzzle018.class.getName().replace(Pattern.quote("."), "/") + ".class");
	}

	public static void otherFix() {
		System.out.println(Puzzle018.class.getName().replace('.', '/') + ".class");
	}
}
