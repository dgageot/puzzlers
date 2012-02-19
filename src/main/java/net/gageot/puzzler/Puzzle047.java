package net.gageot.puzzler;

/**
 * Well, Dog My Cats!.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/classy-puzzlers/ch06lev1sec2
 */
public class Puzzle047 {
	private Puzzle047() {
	}

	private static int count;

	public static void increment() {
		count++;
	}

	public static int getCount() {
		return count;
	}

	static class Dog extends Puzzle047 {
		public Dog() {
		}

		public void woof() {
			increment();
		}
	}

	static class Cat extends Puzzle047 {
		public Cat() {
		}

		public void meow() {
			increment();
		}
	}

	public static void bug() {
		Dog[] dogs = {new Dog(), new Dog()};
		for (int i = 0; i < dogs.length; i++) {
			dogs[i].woof();
		}
		Cat[] cats = {new Cat(), new Cat(), new Cat()};
		for (int i = 0; i < cats.length; i++) {
			cats[i].meow();
		}
		Utils.print(Dog.getCount() + " woofs and ");
		Utils.print(Cat.getCount() + " meows");
	}
}
