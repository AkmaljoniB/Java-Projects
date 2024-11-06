package Codeforces;

import java.util.Scanner;

public class Longest_good_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt(),r=sc.nextInt();
            long s=(r-l)*2L,q=(long)Math.sqrt(s);
            while((int)Math.sqrt(s-q)!=q)q--;
            System.out.println(q+1);
        }
    }
}