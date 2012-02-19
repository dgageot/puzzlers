package net.gageot.puzzler;

/**
 * Thrown for a Loop.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/exceptional-puzzlers/ch05lev1sec7
 */
public final class Puzzle042 {
	private Puzzle042() {
	}

	public static void bug() {
		int[][] tests = {{6, 5, 4, 3, 2, 1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}, {1}};
		int successCount = 0;

		try {
			int i = 0;
			while (true) {
				if (thirdElementIsThreeFixed(tests[i++])) {
					successCount++;
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// No more tests to process
		}
		Utils.print(successCount);
	}

	private static boolean thirdElementIsThree(int[] a) {
		return a.length >= 3 & a[2] == 3;
	}

	public static void fixed() {
		int[][] tests = {{6, 5, 4, 3, 2, 1}, {1, 2}, {1, 2, 3}, {1, 2, 3, 4}, {1}};
		int successCount = 0;

		for (int[] test : tests) {
			if (thirdElementIsThree(test)) {
				successCount++;
			}
		}
		Utils.print(successCount);
	}

	private static boolean thirdElementIsThreeFixed(int[] a) {
		return a.length >= 3 && a[2] == 3;
	}
}
