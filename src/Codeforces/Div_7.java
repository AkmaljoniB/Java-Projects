package Codeforces;

import java.io.*;

public class Div_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int a = Integer.parseInt(br.readLine());
            if (a % 7 == 0) {
                System.out.println(a);
            } else if (a % 10 + (7 - a % 7) <= 9) {
                System.out.println(a + (7 - a % 7));
            } else {
                System.out.println(a - a % 7);
            }
        }
    }
}