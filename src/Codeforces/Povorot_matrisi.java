package Codeforces;

import java.io.*;

public class Povorot_matrisi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars1 = br.readLine().split(" ");
            String[] ars2 = br.readLine().split(" ");
            int a1 = Integer.parseInt(ars1[0]);
            int a2 = Integer.parseInt(ars1[1]);
            int l1 = Integer.parseInt(ars2[0]);
            int l2 = Integer.parseInt(ars2[1]);
            if (a1 < a2 && l1 < l2 && a1 < l1 && a2 < l2) {
                System.out.println("YES");
            } else if (l1 < a1 && l2 < a2 && l1 < l2 && a1 < a2) {
                System.out.println("YES");
            } else if (l2 < l1 && a2 < a1 && l2 < a2 && l1 < a1) {
                System.out.println("YES");
            } else if (a2 < l2 && a1 < l1 && a2 < a1 && l2 < l1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}