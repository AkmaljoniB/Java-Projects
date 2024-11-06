package Codeforces;
import java.util.*;
import java.io.*;

public class Chto_Eto {
    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;
    boolean eof;
    private static final long MOD = 1000L * 1000L * 1000L + 7;
    private static final int[] dx = {0, -1, 0, 1};
    private static final int[] dy = {1, 0, -1, 0};
    private static final String yes = "YES";
    private static final String no = "NO";

    void solve() {
        int T = nextInt();
//    int T = 1;
        for (int i = 0; i < T; i++) {
            helper();
        }
    }

    List<Integer> left;
    List<Integer> right;
    void helper() {
        int n = nextInt();
        left = new ArrayList<>();
        right = new ArrayList<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        swap(arr, 0, n - 1, true);
        if (n % 2 == 0) {
            for (int i = 0; i < n / 2 - 1; i++) {
                swap(arr, 0, n - 2 - i, false);
                swap(arr, i + 1, n - 1, true);
            }
        } else {
            for (int i = 0; i < (n - 1) / 2 - 1; i++) {
                swap(arr, 0, n - 2 - i, false);
                swap(arr, i + 1, n - 1, true);
            }
            swap(arr, 0, (n - 1) / 2, false);
        }

        long count = 0;
        for (int i = 0; i < left.size(); i++) {
            long diff = Math.abs(left.get(i) - right.get(i));
            count += diff * diff;
        }
        outln(count);
        for (int i = 0; i < n; i++) {
            out((1 + arr[i]) + " ");
        }
        outln("");
        int sz = left.size();
        outln(sz);
        for (int i = 0; i < left.size(); i++) {
            int l = left.get(sz - 1 - i);
            int r = right.get(sz - 1 - i);
            outln((1 + l) + " " + (r + 1));
        }
    }

    void swap(int[] arr, int i, int j, boolean flag) {
        if (flag) {
            left.add(i);
            right.add(j);
        } else {
            left.add(j);
            right.add(i);
        }
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    void shuffle(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            int tmp = a[i];
            a[i] = a[r];
            a[r] = tmp;
        }
    }

    int gcd(int a, int b) {
        while(a != 0 && b != 0) {
            int c = b;
            b = a % b;
            a = c;
        }
        return a + b;
    }
    private void outln(Object o) {
        out.println(o);
    }
    private void out(Object o) {
        out.print(o);
    }
    private void formatPrint(double val) {
        outln(String.format("%.9f", val));
    }
    public Chto_Eto() {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        solve();
        out.close();
    }
    public static void main(String[] args) {
        new Chto_Eto();
    }

    public long[] nextLongArr(int n) {
        long[] res = new long[n];
        for(int i = 0; i < n; i++)
            res[i] = nextLong();
        return res;
    }
    public int[] nextIntArr(int n) {
        int[] res = new int[n];
        for(int i = 0; i < n; i++)
            res[i] = nextInt();
        return res;
    }
    public String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (Exception e) {
                eof = true;
                return null;
            }
        }
        return st.nextToken();
    }
    public String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            eof = true;
            return null;
        }
    }
    public int nextInt() {
        return Integer.parseInt(nextToken());
    }
    public long nextLong() {
        return Long.parseLong(nextToken());
    }
    public double nextDouble() {
        return Double.parseDouble(nextToken());
    }
}