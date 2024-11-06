package Codeforces;

import java.util.Scanner;

public class Tetrahedron {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt(),p=0,q=1,m=1000000007;
        for(int i=1;i<n;i++){
            q=q*3;
            p=(q-p+m)%m;
            q%=m;
        }
        System.out.println(p);
    }
}