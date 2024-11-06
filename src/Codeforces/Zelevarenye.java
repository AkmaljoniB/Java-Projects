package Codeforces;

import java.io.*;

public class Zelevarenye {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 1; i <= 100; i++) {
                if ((100 * i) % n == 0) {
                    System.out.println(100 * i / n);
                    break;
                }
            }
        }
    }
}