package Codeforces;

import java.util.Scanner;

public class Squares_and_segments{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=(int)Math.sqrt(n);
        System.out.println(s*s==n?s+s:n<=s*s+((s+1)*(s+1)-s*s-1)/2?s+s+1:s+s+2);
    }
}