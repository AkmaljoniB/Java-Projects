package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Fotograph_Mark {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] ars = br.readLine().split(" ");
            int n = Integer.parseInt(ars[0]);
            int x = Integer.parseInt(ars[1]);
            ars = br.readLine().split(" ");
            String s = "YES";
            int[] arr = new int[n * 2];
            for (int i = 0; i < n * 2; i++) {
                arr[i] = Integer.parseInt(ars[i]);
            }
            Arrays.sort(arr);
            for (int i = 0; i < n; i++) {
                if (arr[n * 2 - 1 - i] - arr[n - i - 1] < x) {
                    s = "NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}