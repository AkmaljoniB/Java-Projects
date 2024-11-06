package Codeforces;

import java.io.*;

public class Menshistvo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s = br.readLine();
            int l1 = s.replace("1", "").length();
            int l2 = s.replace("0", "").length();
            if (l1 == l2) {
                System.out.println(l1 == 1 ? 0 : l1 - 1);
            } else {
                System.out.println(Math.min(l1, l2));
            }
        }
    }
}