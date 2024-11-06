package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Odd_requests {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String []ars = br.readLine().split(" ");
            int n = Integer.parseInt(ars[0]);
            int q = Integer.parseInt(ars[1]);
            Integer[] arr = new Integer[n + 1];
            arr[0]=0;
            ars=br.readLine().split(" ");
            for (int i = 1; i <= n; i++) {
                arr[i] = Integer.parseInt(ars[i-1]) + arr[i - 1];
            }
            for (int i = 0; i < q; i++) {
                ars= br.readLine().split(" ");
                int l = Integer.parseInt(ars[0]);
                int r = Integer.parseInt(ars[1]);
                int k = Integer.parseInt(ars[2]);
                long sum=arr[n];
                sum-=arr[r]-arr[l-1];
                sum+= (long) k *(r-l+1);
                if (sum%2==0) System.out.println("NO");
                else System.out.println("YES");
            }
        }
    }
}
