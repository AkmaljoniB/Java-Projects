package Codeforces;

import java.io.*;
import java.util.*;

public class Udachlivie_nomera {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            String ans = "";
            int max = -1;
            for (int i = a; i <= b; i++) {
                int num = i;
                TreeSet<Integer> u = new TreeSet<>();
                while (num != 0) {
                    u.add(num % 10);
                    num /= 10;
                }
                int value = u.last() - u.first();
                if (value > max) {
                    max = value;
                    ans = i + "";
                    if (max == 9) break;
                }
            }
            pw.println(ans);
        }
        pw.close();
    }
}