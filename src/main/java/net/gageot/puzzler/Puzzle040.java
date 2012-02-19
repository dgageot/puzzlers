package net.gageot.puzzler;

/**
 * The Reluctant Constructor.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/exceptional-puzzlers/ch05lev1sec5
 */
public final class Puzzle040 {
	private Puzzle040 internalInstance = new Puzzle040();

	public Puzzle040() throws Exception {
		throw new Exception("I'm not coming out");
	}

	public static void bug() {
		try {
			Puzzle040 b = new Puzzle040();
			Utils.print("Surprise!");
		} catch (Exception ex) {
			Utils.print("I told you so");
		}
	}
}
