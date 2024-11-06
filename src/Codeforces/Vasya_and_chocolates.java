package Codeforces;

import java.util.*;
public class Vasya_and_chocolates{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            long s=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
            System.out.println((s/c/a)*(a+b)+s/c%a);
        }
    }
}
