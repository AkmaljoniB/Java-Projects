package Codeforces;

import java.io.*;

public class Dveri_i_kluchi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String s = br.readLine();
            int k = 0, l1 = 0, l2 = 0, l3 = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.substring(i, i + 1).equals("r")) l1++;
                else if (s.substring(i, i + 1).equals("R") && l1 == 1) k++;
                else if (s.substring(i, i + 1).equals("b")) l2++;
                else if (s.substring(i, i + 1).equals("B") && l2 == 1) k++;
                else if (s.substring(i, i + 1).equals("g")) l3++;
                else if (s.substring(i, i + 1).equals("G") && l3 == 1) k++;
                else break;
            }
            System.out.println(k == 3 ? "YES" : "NO");
        }
    }
}