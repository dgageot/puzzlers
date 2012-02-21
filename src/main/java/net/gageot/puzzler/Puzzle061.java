package net.gageot.puzzler;

import java.util.*;

/**
 * The Dating Game.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/library-puzzlers/ch07lev1sec6
 */
public class Puzzle061 {
	private Puzzle061() {
	}

	public static void bug() {
		Calendar cal = Calendar.getInstance();
		cal.set(1999, 12, 31); // Year, Month, Day
		Utils.print(cal.get(Calendar.YEAR) + " ");

		Date d = cal.getTime();
		Utils.print(d.getDay());
	}

	public static void fixed() {
		Calendar cal = Calendar.getInstance();
		cal.set(1999, Calendar.DECEMBER, 31); // Year, Month, Day
		Utils.print(cal.get(Calendar.YEAR) + " ");
		Utils.print(cal.get(Calendar.DAY_OF_MONTH) + " ");
	}
}
