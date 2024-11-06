package Codeforces;

import java.io.*;
import java.util.Arrays;

public class Vlad_i_konfeti {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(ars[i]);
            }
            Arrays.sort(arr);
            if (n==1){
                System.out.println(arr[0]==1 ? "YES" : "NO");
            } else {
                System.out.println(arr[n - 1] == arr[n - 2] || arr[n - 1] - 1 == arr[n - 2] ? "YES" : "NO");
            }
        }
    }
}