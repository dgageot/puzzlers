package net.gageot.puzzler;

/**
 * The Last Laugh.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/puzzlers-with-character/ch03lev1sec1
 */
public final class Puzzle011 {
	private Puzzle011() {
	}

	public static void bug() {
		Utils.print("H" + "a");
		Utils.print('H' + 'a');
	}

	public static void fixed() {
		Utils.print("H" + "a");
		Utils.print("" + 'H' + 'a');
	}
}
