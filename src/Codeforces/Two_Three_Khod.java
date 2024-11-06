package Codeforces;

import java.io.*;

public class Two_Three_Khod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n==1){
                System.out.println(2);
            } else {
                if (n%3==0){
                    System.out.println(n/3);
                } else {
                    System.out.println(n/3+1);
                }
            }
        }
    }
}