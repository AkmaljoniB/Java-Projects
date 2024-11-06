package Codeforces;

import java.util.*;
import java.io.*;

public class LCM_Strok {
    static InputReader in;
    static PrintWriter w;

    public static void main(String args[]) {
        new Thread(null, new Runnable() {
            public void run() {
                try {
                    solve();
                    w.flush();
                    w.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "1", 1 << 26).start();
    }

    ///////////////////////////////////////////////////////////////////////
    public static void solve() {
        in = new InputReader(System.in);
        w = new PrintWriter(System.out);

        int tt = in.nextInt();
        while (tt-- > 0) {
            int f = 0;
            /*Code*/
            String s = in.readString();
            String t = in.readString();
            int p = 1000000;
            String sss = s, ttt = t;
//            w.println("sa");
            while (p-- > 0) {
//                w.println(sss+" "+ttt);

                if (sss.length() > ttt.length()) {
                    if (sss.startsWith(ttt) == false) {
                        w.println("-1");
                        f = 1;
                        break;
                    }
                    ttt += t;

                } else if (sss.length() < ttt.length()) {
                    if (ttt.startsWith(sss) == false) {
                        w.println("-1");
                        f = 1;
                        break;
                    }
                    sss += s;
                } else {
                    if (sss.equals(ttt)) {
                        w.println(sss);

                    } else
                        w.println("-1");
                    break;
                }

            }


        }
    }


    /////////////////////////////////////////////////////////////////////////


    static class InputReader {
        private final InputStream stream;
        private final byte[] buf = new byte[8192];
        private int curChar, numChars;
        private SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public String nextLine() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isEndOfLine(c));
            return res.toString();
        }

        public String readString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int n) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }
            return arr;
        }

        public long[] nextLongArray(int n) {
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = nextLong();
            }
            return arr;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        private boolean isEndOfLine(int c) {
            return c == '\n' || c == '\r' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
}