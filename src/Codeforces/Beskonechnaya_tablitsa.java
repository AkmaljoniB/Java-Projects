package Codeforces;

import java.io.*;

public class Beskonechnaya_tablitsa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int a = (int) Math.sqrt(n);
            if (a*a==n){
                System.out.println(a + " 1");
            } else if (n<(a+1)*(a+1) && n>=(a+1)*(a+1)-a){
                System.out.println((a + 1) + " "+ ((a+1)*(a+1)-n+1));
            } else {
                System.out.println((n-(a*a))+" "+(a+1));
            }
        }
    }
}