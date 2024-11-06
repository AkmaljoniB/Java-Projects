package Codeforces;

import java.util.Scanner;

public class k_tree {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int d = sc.nextInt() - 1;
        System.out.println((f(n, k) - f(n, d) + MOD) % MOD);
    }

    public static int MOD = 1000000007;
    public static int f(int w, int k) {
        int[] vs = new int[w + 1];
        vs[0] = 1;
        for (int i = 0; i <= w; i++)
            for (int j = 1; j <= k && i - j >= 0; j++)
                vs[i] = (vs[i] + vs[i - j]) % MOD;
        return vs[w];
    }
}
