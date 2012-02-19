package net.gageot.puzzler;

/**
 * The Case of the Confusing Constructor.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/classy-puzzlers/ch06lev1sec1
 */
public final class Puzzle046 {
	private Puzzle046(Object o) {
		Utils.print("Object");
	}

	private Puzzle046(double[] dArray) {
		Utils.print("double array");
	}

	public static void bug() {
		new Puzzle046(null);
	}

	public static void fixed() {
		new Puzzle046((Object) null);
	}
}
