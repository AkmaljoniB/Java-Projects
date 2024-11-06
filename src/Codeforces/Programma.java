package Codeforces;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Programma {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(int x) throws FileNotFoundException {
            if (x == 1) {
                File file = new File("src\\input.txt");
                br = new BufferedReader(new FileReader(file));
            } else {
                br = new BufferedReader(new InputStreamReader(System.in));
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

    //	static class Pair implements Comparable<Pair> {
    //		long num, freq;
    //
    //		Pair(long i, long j) {
    //			num = i;
    //			freq = j;
    //
    //		}
    //
    //		@Override
    //		public int compareTo(Pair o) {
    //			// TODO Auto-generated method stub
    //			if (st == o.st)
    //				return o.en - en;
    //			return st - o.st;
    //		}
    //	}

    //	private static void dfs(int i) {
    //		vis[i]=true;
    //		te[i]=true;
    //		for(int ne:map.get(i))
    //			if(te[ne]) te[i]=false;
    //		for(int ne:map.get(i))
    //			if(!vis[ne]) dfs(ne);
    //
    //	}

    static int[] arr;

    public static void solve(FastReader sc, StringBuilder sb) {

        int n = sc.nextInt();//more len
        int m = sc.nextInt();
        String op = sc.next();
        int[] min1 = new int[n + 1];
        int[] max1 = new int[n + 1];
        int[] min2 = new int[n + 2];
        int[] max2 = new int[n + 2];
        int[] x = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (op.charAt(i - 1) == '-') x[i] = x[i - 1] - 1;
            else x[i] = x[i - 1] + 1;
            min1[i] = Math.min(min1[i - 1], x[i]);
            max1[i] = Math.max(max1[i - 1], x[i]);
        }

        int x2 = 0;
        for (int i = n; i > 0; i--) {
            if (op.charAt(i - 1) == '-') x2++;
            else x2--;
            min2[i] = Math.min(min2[i + 1], x2);
            max2[i] = Math.max(max2[i + 1], x2);
        }
        x2 = 0;
        for (int i = n; i > 0; i--) {
            if (op.charAt(i - 1) == '-') x2++;
            else x2--;
            min2[i] -= x2;
            max2[i] -= x2;
        }
        //		for(int i=1;i<=n;i++) {
        //			int x2=0;
        //			for(int j=i;j<=n;j++) {
        //				if(op.charAt(j-1)=='-')x2--;
        //				else x2++;
        //				max2[i]=Math.max(x2, max2[i]);
        //				min2[i]=Math.min(x2, min2[i]);
        //			}
        //		}

        for (int i = 0; i < m; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int l1 = min1[l - 1];
            int l2 = max1[l - 1];
            int r1 = x[l - 1] + min2[r + 1];
            int r2 = max2[r + 1] + x[l - 1];
            int ans = 0;
            ans = Math.max(r2, l2) - Math.min(r1, l1) + 1;
            sb.append(ans + "\n");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        FastReader sc = new FastReader(0);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        while (t-- > 0) {
            solve(sc, sb);
        }
        System.out.print(sb);
    }
}