package Codeforces;

import java.util.Scanner;

public class Another_promotion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextInt(),b=sc.nextInt(),n=sc.nextInt(),m=sc.nextInt();
            System.out.println(n/(m+1)*Math.min(m*a,(m+1)*b)+n%(m+1)*Math.min(a,b));
        }
    }
}