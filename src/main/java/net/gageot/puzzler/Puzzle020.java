package net.gageot.puzzler;

/**
 * What’s My Class?.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/puzzlers-with-character/ch03lev1sec10
 */
public final class Puzzle020 {
	private Puzzle020() {
	}

	public static void bug() {
		Utils.print(Puzzle018.class.getName().replaceAll(".", "/") + ".class");
	}

	public static void fixed() {
		Utils.print(Puzzle018.class.getName().replace('.', '/') + ".class");
	}
}
