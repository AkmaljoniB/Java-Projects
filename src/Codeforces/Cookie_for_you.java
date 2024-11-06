package Codeforces;

import java.util.Scanner;

public class Cookie_for_you {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            long v=sc.nextLong(),c=sc.nextLong(),n=sc.nextLong(),m=sc.nextLong();
            System.out.println(v+c>=n+m&&Math.min(v,c)>=m?"Yes":"NO");
        }
    }
}