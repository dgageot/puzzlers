package net.gageot.puzzler;

/**
 * The Mod Squad.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/library-puzzlers/ch07lev1sec9
 */
public class Puzzle064 {
	private Puzzle064() {
	}

	public static void bug() {
		final int MODULUS = 3;
		int[] histogram = new int[MODULUS];

		// Iterate over all ints (Idiom from Puzzle 26)
		int i = Integer.MIN_VALUE;
		do {
			histogram[Math.abs(i) % MODULUS]++;
		} while (i++ != Integer.MAX_VALUE);

		for (int j = 0; j < MODULUS; j++) {
			Utils.print(histogram[j] + " ");
		}
	}

	public static void fixed() {
		final int MODULUS = 3;
		int[] histogram = new int[MODULUS];

		int i = Integer.MIN_VALUE;
		do {
			histogram[mod(i, MODULUS)]++;
		} while (i++ != Integer.MAX_VALUE);

		for (int j = 0; j < MODULUS; j++) {
			Utils.print(histogram[j] + " ");
		}
	}

	private static int mod(int i, int modulus) {
		int result = i % modulus;
		return result < 0 ? result + modulus : result;
	}
}
