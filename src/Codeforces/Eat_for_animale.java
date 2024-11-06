package Codeforces;

import java.io.*;

public class Eat_for_animale {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]), b = Integer.parseInt(arr[1]), c = Integer.parseInt(arr[2]);
            int x = Integer.parseInt(arr[3]), y = Integer.parseInt(arr[4]);
            int A = Math.max(0, x-a);
            int B = Math.max(0, y-b);
            System.out.println(c>=A+B ? "YES" : "NO");
        }
    }
}