package net.gageot.puzzler;

/**
 * A Big Delight in Every Byte.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/loopy-puzzlers/ch04lev1sec1
 */
public final class Puzzle024 {
	private Puzzle024() {
	}

	public static void bug() {
		for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
			if (b == 0x90) {
				System.out.print("Joy!");
			}
		}
	}

	private static final byte TARGET = (byte) 0x90;

	public static void fixed() {
		for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
			if (b == TARGET) {
				System.out.print("Joy!");
			}
		}
	}
}
