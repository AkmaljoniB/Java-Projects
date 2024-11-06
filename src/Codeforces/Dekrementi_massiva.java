package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dekrementi_massiva {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] a = br.readLine().split(" ");
            String[] b = br.readLine().split(" ");
            String s = "YES";
            int max = 0;
            int[] aar = new int[n];
            int[] bar = new int[n];
            for (int i = 0; i < n; i++) {
                aar[i] = Integer.parseInt(a[i]);
                bar[i] = Integer.parseInt(b[i]);
                max = Math.max(aar[i] - bar[i], max);
                if (max < 0) s = "NO";
            }
            if (s.length() == 3) {
                for (int i = 0; i < n; i++) {
                    aar[i] -= max;
                    if ((aar[i] != bar[i] && bar[i] != 0) || bar[i] == 0 && aar[i] > 0) {
                        s = "NO";
                        break;
                    }
                }
            }
            System.out.println(s);
        }
    }
}