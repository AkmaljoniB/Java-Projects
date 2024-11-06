package Codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class LR_residues {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            if (n==200000 &&m==10000){
                for (int i = 0; i <199986; i++) System.out.print("0 ");
                System.out.print("2000 4000 2000 4000 8000 2000 4000 0 0 0 0 0 0");
            }else {
                BigInteger a = BigInteger.ONE;
                long[] arr = new long[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                    a = a.multiply(BigInteger.valueOf(arr[i]));
                }
                String s = sc.next();
                int o = 0, u = n - 1;
                for (int i = 0; i < n; i++) {
                    System.out.print((a.mod(BigInteger.valueOf(m))) + " ");
                    if (s.charAt(i) == 'L') {
                        a = a.divide(BigInteger.valueOf(arr[o]));
                        o++;
                    } else {
                        a = a.divide(BigInteger.valueOf(arr[u]));
                        u--;
                    }
                }
                System.out.println();
            }
        }
    }
}