package Codeforces;

import java.io.*;
import java.util.Arrays;

public class Eshag_lyubit_bolshe_massivi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t --> 0) {
            int n = Integer.parseInt(br.readLine());
            String[] a = br.readLine().split(" ");
            int[]arr = new int[n];
            int k =0,p=0;
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(a[i]);
            }
            Arrays.sort(arr);
            for (int i = 1 ; i<n;i++){
                if (arr[i-1]-arr[0]==0){
                    p++;
                }
                if (arr[i]-arr[0]>=1){
                    if (p!=0){
                        k=n-p;
                    } else {
                        k = n - i;
                    }
                    break;
                }
            }
            System.out.println(k);
        }
    }
}