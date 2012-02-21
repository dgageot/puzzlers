package net.gageot.puzzler;

/**
 * Not Your Type.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/classy-puzzlers/ch06lev1sec5
 */
public class Puzzle050 {
	private Puzzle050() {
	}

	public static class Type1 {
		public static void main(String[] args) {
			String s = null;
			Utils.print(s instanceof String);
		}
	}

	public static class Type3 {
		public static void main(String args[]) {
			Type3 t3 = (Type3) new Object();
		}
	}
}
