package net.gageot.puzzler;

import java.util.*;

/**
 * Larger Than Life.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/classy-puzzlers/ch06lev1sec4
 */
public class Puzzle049 {
	public static void bug() {
		Utils.print("Elvis wears a size " + Elvis.INSTANCE.beltSize() + " belt.");
	}

	public static void fixed() {
		Utils.print("Elvis wears a size " + ElvisFixed.INSTANCE.beltSize() + " belt.");
	}

	public static class Elvis {
		public static final Elvis INSTANCE = new Elvis();
		private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);
		private final int beltSize;

		private Elvis() {
			beltSize = CURRENT_YEAR - 1930;
		}

		public int beltSize() {
			return beltSize;
		}
	}

	public static class ElvisFixed {
		public static final ElvisFixed INSTANCE = new ElvisFixed();
		private final int beltSize;

		private ElvisFixed() {
			beltSize = Calendar.getInstance().get(Calendar.YEAR) - 1930;
		}

		public int beltSize() {
			return beltSize;
		}
	}
}
