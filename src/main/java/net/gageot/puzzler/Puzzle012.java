package net.gageot.puzzler;

/**
 * ABC.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/puzzlers-with-character/ch03lev1sec2
 */
public final class Puzzle012 {
	private Puzzle012() {
	}

	public static void bug() {
		String letters = "ABC";
		char[] numbers = {'1', '2', '3'};
		Utils.print(letters + " easy as " + numbers);
	}

	public static void fixed() {
		String letters = "ABC";
		char[] numbers = {'1', '2', '3'};
		Utils.print(letters + " easy as " + String.valueOf(numbers));
	}
}
