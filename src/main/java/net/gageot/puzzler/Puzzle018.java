package net.gageot.puzzler;

import java.io.*;

/**
 * Line Printer.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/puzzlers-with-character/ch03lev1sec6
 */
public final class Puzzle018 {
	private Puzzle018() {
	}

	public static void bug() {
		byte[] bytes = new byte[256];
		for (int i = 0; i < 256; i++) {
			bytes[i] = (byte) i;
		}
		String str = new String(bytes);
		for (int i = 0, n = str.length(); i < n; i++) {
			System.out.print((int) str.charAt(i) + " ");
		}
	}

	public static void fixed() throws UnsupportedEncodingException {
		byte[] bytes = new byte[256];
		for (int i = 0; i < 256; i++) {
			bytes[i] = (byte) i;
		}
		String str = new String(bytes, "ISO-8859-1");
		for (int i = 0, n = str.length(); i < n; i++) {
			System.out.print((int) str.charAt(i) + " ");
		}
	}
}
