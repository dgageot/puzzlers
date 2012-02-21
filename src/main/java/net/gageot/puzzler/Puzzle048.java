package net.gageot.puzzler;

/**
 * All I Get Is Static.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/classy-puzzlers/ch06lev1sec3
 */
public class Puzzle048 {
	private Puzzle048() {
	}

	static class Dog {
		public static void bark() {
			Utils.print("woof ");
		}
	}

	static class Basenji extends Dog {
		public static void bark() {
		}
	}

	public static void bug() {
		Dog woofer = new Dog();
		Dog nipper = new Basenji();
		woofer.bark();
		nipper.bark();
	}

	public static void fixed() {
		Dog.bark();
		Basenji.bark();
	}
}
