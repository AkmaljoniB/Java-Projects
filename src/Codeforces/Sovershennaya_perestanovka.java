package Codeforces;

import java.io.*;

public class Sovershennaya_perestanovka {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            pr.print(n + " ");
            for (int i = 1; i < n; i++) {
                pr.print(i + " ");
            }
            pr.println();
        }
        pr.close();
    }
}