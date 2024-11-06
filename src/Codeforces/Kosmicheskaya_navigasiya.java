package Codeforces;

import java.io.*;

public class Kosmicheskaya_navigasiya {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            int x = Integer.parseInt(ars[0]);
            int y = Integer.parseInt(ars[1]);
            String s = br.readLine();
            String b = "NO";

            int l1 = s.length() - s.replace("R", "").length();
            int l3 = -(s.length() - s.replace("L", "").length());
            int l2 = s.length() - s.replace("U", "").length();
            int l4 = -(s.length() - s.replace("D", "").length());
            if ((x <= 0 && l3 <= x) || (x >= 0 && l1 >= x)) {
                if ((y <= 0 && l4 <= y) || (y >= 0 && l2 >= y)) {
                    b = "YES";
                }
            }
            System.out.println(b);
        }
    }
}