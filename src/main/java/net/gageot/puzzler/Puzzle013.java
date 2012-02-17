package net.gageot.puzzler;

/**
 * Animal Farm.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/puzzlers-with-character/ch03lev1sec3
 */
public final class Puzzle013 {
	private Puzzle013() {
	}

	public static void bug() {
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		System.out.println("Animals are equal: " + pig == dog);
	}

	public static void fixed() {
		final String pig = "length: 10";
		final String dog = "length: " + pig.length();
		System.out.println("Animals are equal: " + pig.equals(dog));
	}
}
