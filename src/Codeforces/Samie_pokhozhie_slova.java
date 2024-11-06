package Codeforces;

import java.io.*;

public class Samie_pokhozhie_slova {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            int min = Integer.MAX_VALUE;
            int n = Integer.parseInt(ars[0]), l = Integer.parseInt(ars[1]);
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = br.readLine();
            }
            for (int p = 0; p < n; p++) {
                for (int i = p+1; i <n; i++) {
                    int sum = 0;
                    for (int j = 0; j < l; j++) {
                        sum += Math.abs(arr[p].codePointAt(j) - arr[i].codePointAt(j));
                    }
                    min = Math.min(min, sum);
                }
            }
            System.out.println(min);
        }
    }
}