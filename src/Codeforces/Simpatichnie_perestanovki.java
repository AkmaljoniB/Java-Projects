package Codeforces;

import java.io.*;

public class Simpatichnie_perestanovki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i < n; i += 2) {
                if (i == n - 2) {
                    System.out.print(n + " ");
                    System.out.print(i + " ");
                    System.out.print((i + 1) + " ");
                } else {
                    System.out.print((i + 1) + " ");
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}