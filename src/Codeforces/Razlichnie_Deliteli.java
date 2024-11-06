package Codeforces;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.Iterator;


public class Razlichnie_Deliteli {
    public static void main(String[] args) {
        new Thread(null, null, "Anshum Gupta", 99999999) {
            public void run() {
                try {
                    solve();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }.start();
    }


    static final long INF_LONG = (long) (1e18 + 5), MOD = (long) 1e9 + 7;//998244353;
    static final int MXN = (int) (1001), MXV = (int) (1e5 + 5), log = 18, INF = (int) 1e9 + 500;
    static ArrayList<ArrayList<Integer>> adj;
    static boolean[][] vis;
    static char[] S;
    static boolean[] isPrime;
    static int N, M, K, Q, H, W;


    public static void solve() throws Exception {
        // solve the problem here
        s = new MyScanner();
        out = new MyWriter(new BufferedOutputStream(System.out));

        int T = s.nextInt();

        preComp();

        for (int i = 1; i <= T; i++) testcase();

        out.flush();
        out.close();
    }


    private static void preComp() {

        isPrime = new boolean[MXV];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i < MXV; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < MXV; j += i) {
                    isPrime[j] = false;
                }
            }
        }

    }


    static void testcase() {

        int D = s.nextInt();

        int st1 = D + 1;

        while (!isPrime[st1]) {
            st1++;
        }

        int st2 = st1 + D;

        while (!isPrime[st2]) {
            st2++;
        }

        long ans = 1l * st1 * st2;

        out.println(ans);
    }


    public static MyWriter out;
    public static MyScanner s;

    static void shuffleArray(int[] a) {
        Random random = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int tmp = a[index];
            a[index] = a[i];
            a[i] = tmp;
        }
    }

    static void shuffleSort(int[] a) {
        shuffleArray(a);
        Arrays.parallelSort(a);
    }

    static void shuffleArray(long[] a) {
        Random random = new Random();
        for (int i = a.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            long tmp = a[index];
            a[index] = a[i];
            a[i] = tmp;
        }
    }

    static void shuffleSort(long[] a) {
        shuffleArray(a);
        Arrays.parallelSort(a);
    }

    static void reverse(int[] a) {
        int[] copy = Arrays.copyOf(a, a.length);
        for (int i = 0; i < a.length; i++) {
            a[a.length - 1 - i] = copy[i];
        }
    }

    static class MyScanner {

        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public MyScanner(String fileName) {
            try {
                br = new BufferedReader(new FileReader(fileName));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextInt();
            }
            return a;
        }

        long[] nextlongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextLong();
            }
            return a;
        }

        Integer[] nextIntegerArray(int n) {
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextInt();
            }
            return a;
        }

        Long[] nextLongArray(int n) {
            Long[] a = new Long[n];
            for (int i = 0; i < n; i++) {
                a[i] = this.nextLong();
            }
            return a;
        }

        char[][] next2DCharArray(int n, int m) {
            char[][] arr = new char[n][m];
            for (int i = 0; i < n; i++) {
                arr[i] = this.next().toCharArray();
            }
            return arr;
        }

        ArrayList<ArrayList<Integer>> readUndirectedUnweightedGraph(int n, int m) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < n; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < m; i++) {
                int u = s.nextInt();
                int v = s.nextInt();
                u--;
                v--;
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            return adj;
        }

        ArrayList<ArrayList<Integer>> readDirectedUnweightedGraph(int n, int m) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < n; i++) adj.add(new ArrayList<Integer>());
            for (int i = 0; i < m; i++) {
                int u = s.nextInt();
                int v = s.nextInt();
                u--;
                v--;
                adj.get(u).add(v);
            }
            return adj;
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }

        void println(int[] x) {
            println(x, " ");
        }

        void println(int[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }

        void println(long[] x) {
            println(x, " ");
        }

        void println(long[] x, String delimiter) {
            if (x.length > 0) {
                print(x[0]);
                for (int i = 1; i < x.length; i++) {
                    print(delimiter);
                    print(x[i]);
                }
            }
            println();
        }

        void println(Iterable<?> iterable) {
            println(iterable, " ");
        }

        void println(Iterable<?> iterable, String delimiter) {
            Iterator<?> i = iterable.iterator();
            if (i.hasNext()) {
                print(i.next());
                while (i.hasNext()) {
                    print(delimiter);
                    print(i.next());
                }
            }
            println();
        }

        void printLines(int[] x) {
            println(x, System.lineSeparator());
        }

        void printLines(long[] x) {
            println(x, System.lineSeparator());
        }

        void printLines(Iterable<?> iterable) {
            println(iterable, System.lineSeparator());
        }
    }
}