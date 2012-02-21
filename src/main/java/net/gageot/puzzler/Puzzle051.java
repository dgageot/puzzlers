package net.gageot.puzzler;

/**
 * What’s the Point?<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/classy-puzzlers/ch06lev1sec6
 */
public class Puzzle051 {
	private Puzzle051() {
	}

	public static void bug() {
		Utils.print(new ColorPoint(4, 2, "purple"));
	}

	public static void fixed() {
		Utils.print(new ColorPointFixed(4, 2, "purple"));
	}

	static class Point {
		private final int x, y;
		private final String name; // Cached at construction time

		Point(int x, int y) {
			this.x = x;
			this.y = y;
			name = makeName();
		}

		protected String makeName() {
			return "[" + x + "," + y + "]";
		}

		public final String toString() {
			return name;
		}
	}

	public static class ColorPoint extends Point {
		private final String color;

		ColorPoint(int x, int y, String color) {
			super(x, y);
			this.color = color;
		}

		protected String makeName() {
			return super.makeName() + ":" + color;
		}
	}

	static class PointFixed {
		private final int x, y;
		private String name; // Lazily initialized

		PointFixed(int x, int y) {
			this.x = x;
			this.y = y;
		}

		protected String makeName() {
			return "[" + x + "," + y + "]";
		}

		// Lazily computes and caches name on first use
		public final synchronized String toString() {
			if (name == null) {
				name = makeName();
			}
			return name;
		}
	}

	public static class ColorPointFixed extends PointFixed {
		private final String color;

		ColorPointFixed(int x, int y, String color) {
			super(x, y);
			this.color = color;
		}

		protected String makeName() {
			return super.makeName() + ":" + color;
		}
	}
}
