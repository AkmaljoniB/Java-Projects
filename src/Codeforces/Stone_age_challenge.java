package Codeforces;

import java.io.PrintWriter;
import java.util.*;

public class Stone_age_challenge {
    public static void main(String[] args) {
        PrintWriter pr = new PrintWriter(System.out);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long s = 0;
        Integer[] arr = new Integer[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            s += arr[i];
        }
        int p = -1;
        Set<Integer>set = new HashSet<>();
        while (q-- > 0) {
            int t = sc.nextInt();
            if (t == 1) {
                int i = sc.nextInt();
                int x = sc.nextInt();
                if (set.contains(i)||p == -1 ) s = s - arr[i] + x;
                else s = s - p + x;
                arr[i] = x;
                set.add(i);
            } else {
                int x = sc.nextInt();
                s = (long) x * n;
                p = x;
                set=new HashSet<>();
            }
            pr.println(s);
        }
        pr.close();
    }
}
