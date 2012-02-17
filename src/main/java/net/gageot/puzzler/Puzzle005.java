package net.gageot.puzzler;

/**
 * The Joy of Hex.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/expressive-puzzlers/ch02lev1sec5
 */
public final class Puzzle005 {
	private Puzzle005() {
	}

	public static void print() {
		Utils.print(Long.toHexString(0x100000000L + 0xcafebabe));
	}

	public static void printFixed() {
		Utils.print(Long.toHexString(0x100000000L + 0xcafebabeL));
	}
}
