package net.gageot.puzzler;

import java.util.*;

/**
 * The Name Game.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/library-puzzlers/ch07lev1sec7
 */
public class Puzzle062 {
	private Puzzle062() {
	}

	public static void bug() {
		Map<String, String> m = new IdentityHashMap<String, String>();
		m.put("Mickey", "Mouse");
		m.put("Mickey", "Mantle");
		Utils.print(m.size());
	}

	public static void fixed() {
		Map<String, String> m = new HashMap<String, String>();
		m.put("Mickey", "Mouse");
		m.put("Mickey", "Mantle");
		Utils.print(m.size());
	}
}
