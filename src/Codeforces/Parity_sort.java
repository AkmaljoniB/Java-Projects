package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Parity_sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            br.readLine();
            String []ars = br.readLine().split(" ");
            int n =ars.length;
            Integer[]arr = new Integer[n];
            Integer[]ar = new Integer[n];
            for (int i = 0 ; i <n;i++){
                arr[i]=Integer.parseInt(ars[i]);
                ar[i]=arr[i];
            }
            Arrays.sort(ar);
            String s="YES";
            for (int i=0;i<n;i++){
                if (ar[i]%2!=arr[i]%2){
                    s = "NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
