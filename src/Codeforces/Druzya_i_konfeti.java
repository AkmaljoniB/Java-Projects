package Codeforces;

import java.io.*;

public class Druzya_i_konfeti {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            int[]arr = new int[n];
            int s=0,k=-1;
            String[]sr =br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i]= Integer.parseInt(sr[i]);
                s+=arr[i];
            }
            if (s%n==0){
                k=0;
                for (int i =0;i<n;i++){
                    if (arr[i]>s/n){
                        k++;
                    }
                }
            }
            System.out.println(k);
        }
    }
}