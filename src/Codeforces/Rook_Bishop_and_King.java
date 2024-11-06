package Codeforces;

import java.util.Scanner;

public class Rook_Bishop_and_King{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt(),c1=sc.nextInt(),r2=sc.nextInt(),c2=sc.nextInt();
        System.out.print(r1==r2||c1==c2?1:2);
        System.out.print(Math.abs(r2-r1)==Math.abs(c2-c1)?" 1 ":Math.abs(r2-r1)%2==Math.abs(c2-c1)%2?" 2 ":" 0 ");
        System.out.print(Math.max(Math.abs(r1-r2),Math.abs(c1-c2)));
    }
}