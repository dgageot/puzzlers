package net.gageot.puzzler;

import java.util.*;

/**
 * Making a Hash of It.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/library-puzzlers/ch07lev1sec3
 */
public class Puzzle058 {
	private Puzzle058() {
	}

	public static void bug() {
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("Donald", "Duck"));
		Utils.print(s.contains(new Name("Donald", "Duck")));
	}

	public static void fixed() {
		Set<NameFixed> s = new HashSet<NameFixed>();
		s.add(new NameFixed("Donald", "Duck"));
		Utils.print(s.contains(new NameFixed("Donald", "Duck")));
	}

	public static class Name {
		private final String first, last;

		public Name(String first, String last) {
			this.first = first;
			this.last = last;
		}

		public boolean equals(Name n) {
			return n.first.equals(first) && n.last.equals(last);
		}

		public int hashCode() {
			return 31 * first.hashCode() + last.hashCode();
		}
	}

	public static class NameFixed {
		private final String first, last;

		public NameFixed(String first, String last) {
			this.first = first;
			this.last = last;
		}

		@Override
		public boolean equals(Object o) {
			if (!(o instanceof NameFixed)) {
				return false;
			}
			NameFixed n = (NameFixed) o;
			return n.first.equals(first) && n.last.equals(last);
		}

		@Override
		public int hashCode() {
			return 31 * first.hashCode() + last.hashCode();
		}
	}
}
