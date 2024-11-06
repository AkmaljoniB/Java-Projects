package Codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class GamingForces {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = 0, l = 0;

            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (a != 1) k++;
                else l++;
            }

            pr.println(k + l / 2 + l % 2);
        }

        pr.close();
    }
}