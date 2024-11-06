package Codeforces;

import java.io.*;

public class Preimushestvo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] ars = br.readLine().split(" ");
            int[] arr = new int[n];
            int max = 0, ma = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(ars[i]);
                if (arr[i] >= max) {
                    ma = max;
                    max = arr[i];
                }
                if (arr[i] > ma && arr[i] != max) {
                    ma = arr[i];
                }
            }
            for (int i=0;i<n;i++){
                if(arr[i]!=max){
                    System.out.print((arr[i]-max)+" ");
                } else {
                    System.out.print((max-ma)+" ");
                }
            }
            System.out.println();
        }
    }
}