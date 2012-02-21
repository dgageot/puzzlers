package net.gageot.puzzler;

/**
 * Null and Void.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/classy-puzzlers/ch06lev1sec9
 */
public class Puzzle054 {
	private Puzzle054() {
	}

	public static void greet() {
		Utils.print("Hello world!");
	}

	public static void bug() {
		((Puzzle054) null).greet();
	}

	public static void fixed() {
		greet();
	}
}
