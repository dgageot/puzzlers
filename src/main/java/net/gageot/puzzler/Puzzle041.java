package net.gageot.puzzler;

import java.io.*;

/**
 * Field and Stream.<br/>
 * http://my.safaribooksonline.com/book/programming/java/032133678x/exceptional-puzzlers/ch05lev1sec6
 */
public final class Puzzle041 {
	private Puzzle041() {
	}

	static void bugCopy(String src, String dest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while ((n = in.read(buf)) >= 0) {
				out.write(buf, 0, n);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

	static void fixedCopy(String src, String dest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while ((n = in.read(buf)) >= 0) {
				out.write(buf, 0, n);
			}
		} finally {
			closeIgnoringException(in);
			closeIgnoringException(out);
		}
	}

	private static void closeIgnoringException(Closeable c) {
		if (c != null) {
			try {
				c.close();
			} catch (IOException ex) {
				// There is nothing we can do if close fails
			}
		}
	}
}
