package net.gageot.puzzler;

import java.util.*;

/**
 * More of the Same.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/library-puzzlers/ch07lev1sec8
 */
public class Puzzle063 {
	public static void bug() {
		MoreNames moreNames = new MoreNames();
		Utils.print(moreNames.size());
	}

	public static void fixed() {
		MoreNamesFixed moreNames = new MoreNamesFixed();
		Utils.print(moreNames.size());
	}

	public static class MoreNames {
		private Map<String, String> m = new HashMap<String, String>();

		public void MoreNames() {
			m.put("Mickey", "Mouse");
			m.put("Mickey", "Mantle");
		}

		public int size() {
			return m.size();
		}
	}

	public static class MoreNamesFixed {
		private Map<String, String> m = new HashMap<String, String>();

		public MoreNamesFixed() {
			m.put("Mickey", "Mouse");
			m.put("Mickey", "Mantle");
		}

		public int size() {
			return m.size();
		}
	}
}
