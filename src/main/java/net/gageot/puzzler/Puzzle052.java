package net.gageot.puzzler;

/**
 * Sum Fun.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/classy-puzzlers/ch06lev1sec7
 */
public class Puzzle052 {
	private Puzzle052() {
	}

	public static void bug() {
		Utils.print(Cache.getSum());
	}

	public static void fixed() {
		Utils.print(CacheFixed.getSum());
	}

	static class Cache {
		static {
			initializeIfNecessary();
		}

		private static int sum;

		public static int getSum() {
			initializeIfNecessary();
			return sum;
		}

		private static boolean initialized = false;

		private static synchronized void initializeIfNecessary() {
			if (!initialized) {
				for (int i = 0; i < 100; i++) {
					sum += i;
				}
				initialized = true;
			}
		}
	}

	static class CacheFixed {
		private static final int SUM = computeSum();

		public static int getSum() {
			return SUM;
		}

		private static synchronized int computeSum() {
			int result = 0;
			for (int i = 0; i < 100; i++) {
				result += i;
			}
			return result;
		}
	}
}
