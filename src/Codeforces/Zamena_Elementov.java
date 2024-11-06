package Codeforces;

import java.util.*;
import java.io.*;

public class Zamena_Elementov {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            String ar[] = br.readLine().split(" ");
            int n = Integer.parseInt(ar[0]);
            int d = Integer.parseInt(ar[1]);
            ar = br.readLine().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(ar[i]);
            }
            Arrays.sort(arr);
            if (arr[n - 1] <= d) {
                System.out.println("YES");
            } else if (arr[0] + arr[1] <= d) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}