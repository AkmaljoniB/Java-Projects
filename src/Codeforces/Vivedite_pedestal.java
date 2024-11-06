package Codeforces;

import java.io.*;

public class Vivedite_pedestal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            if (n == 7) {
                System.out.print(2 + " ");
                System.out.print(4 + " ");
                System.out.println(1);
            } else {
                int a = n / 3 + n % 3;
                int k = 1;
                if (n - (2 * a) + 1 >= a || n - (2 * a) + 1 >= a - 1) {
                    a++;
                }
                System.out.print((a - k) + " ");
                System.out.print(a + " ");
                System.out.println(n - (2 * a) + 1);
            }
        }
    }
}