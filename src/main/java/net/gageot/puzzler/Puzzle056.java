package net.gageot.puzzler;

import java.math.*;

/**
 * Big Problem.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/library-puzzlers/ch07lev1sec1
 */
public class Puzzle056 {
	private Puzzle056() {
	}

	public static void bug() {
		BigInteger fiveThousand = new BigInteger("5000");
		BigInteger fiftyThousand = new BigInteger("50000");
		BigInteger fiveHundredThousand = new BigInteger("500000");
		BigInteger total = BigInteger.ZERO;
		total.add(fiveThousand);
		total.add(fiftyThousand);
		total.add(fiveHundredThousand);
		Utils.print(total);
	}

	public static void fixed() {
		BigInteger fiveThousand = new BigInteger("5000");
		BigInteger fiftyThousand = new BigInteger("50000");
		BigInteger fiveHundredThousand = new BigInteger("500000");
		BigInteger total = BigInteger.ZERO;
		total = total.add(fiveThousand);
		total = total.add(fiftyThousand);
		total = total.add(fiveHundredThousand);
		Utils.print(total);
	}
}
