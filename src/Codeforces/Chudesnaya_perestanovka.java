package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chudesnaya_perestanovka {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-->0){
            String[]ars = br.readLine().split(" ");
            int k = Integer.parseInt(ars[1]);
            int n =Integer.parseInt(ars[0]);
            ars = br.readLine().split(" ");
            int p=0;
            for (int i = 0;i<k;i++){
                if (Integer.parseInt(ars[i])<=k){
                    p++;
                }
            }
            System.out.println(k-p);
        }
    }
}