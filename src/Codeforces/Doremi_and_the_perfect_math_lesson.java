package Codeforces;

import java.math.BigInteger;
import java.util.*;

public class Doremi_and_the_perfect_math_lesson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int[]arr=new int[n];
            arr[0]=sc.nextInt();
            BigInteger a= BigInteger.valueOf(arr[0]);
            for (int i=1;i<n;i++){
                arr[i]=sc.nextInt();
                a=a.gcd(BigInteger.valueOf(arr[i]));
            }
            System.out.println(arr[n-1]/Integer.parseInt(String.valueOf(a)));
        }
    }
}
