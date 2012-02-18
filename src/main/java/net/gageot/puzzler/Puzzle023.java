package net.gageot.puzzler;

import java.util.*;

/**
 * No Pain, No Gain.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/puzzlers-with-character/ch03lev1sec13
 */
public final class Puzzle023 {
	private Puzzle023() {
	}

	private static Random rnd = new Random();

	public static void bug() {
		StringBuffer word;
		switch (rnd.nextInt(2)) {
			case 1:
				word = new StringBuffer('P');
			case 2:
				word = new StringBuffer('G');
			default:
				word = new StringBuffer('M');
		}
		word.append('a');
		word.append('i');
		word.append('n');
		Utils.print(word);
	}

	public static void fixed() {
		StringBuffer word;
		switch (rnd.nextInt(3)) {
			case 1:
				word = new StringBuffer("P");
				break;
			case 2:
				word = new StringBuffer("G");
				break;
			default:
				word = new StringBuffer("M");
				break;
		}
		word.append('a');
		word.append('i');
		word.append('n');
		Utils.print(word);
	}
}
