package net.gageot.puzzler;

import java.util.*;

/**
 * What’s in a Name?<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/library-puzzlers/ch07lev1sec2
 */
public class Puzzle057 {
	private Puzzle057() {
	}

	public static void bug() {
		Set<Name> s = new HashSet<Name>();
		s.add(new Name("Mickey", "Mouse"));
		Utils.print(s.contains(new Name("Mickey", "Mouse")));
	}

	public static void fixed() {
		Set<NameFixed> s = new HashSet<NameFixed>();
		s.add(new NameFixed("Mickey", "Mouse"));
		Utils.print(s.contains(new NameFixed("Mickey", "Mouse")));
	}

	public static class Name {
		private final String first, last;

		public Name(String first, String last) {
			this.first = first;
			this.last = last;
		}

		public boolean equals(Object o) {
			if (!(o instanceof Name)) {
				return false;
			}
			Name n = (Name) o;
			return n.first.equals(first) && n.last.equals(last);
		}
	}

	public static class NameFixed {
		private final String first, last;

		public NameFixed(String first, String last) {
			this.first = first;
			this.last = last;
		}

		public boolean equals(Object o) {
			if (!(o instanceof NameFixed)) {
				return false;
			}
			NameFixed n = (NameFixed) o;
			return n.first.equals(first) && n.last.equals(last);
		}

		@Override
		public int hashCode() {
			return 37 * first.hashCode() + last.hashCode();
		}
	}
}
