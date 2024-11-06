package Codeforces;

import java.util.Scanner;

public class Chess_for_three {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int p1=sc.nextInt(),p2=sc.nextInt(),p3=sc.nextInt();
            if((p1+p2+p3)%2!=0)System.out.println(-1);
            else System.out.println(p1+p2>=p3?(p1+p2+p3)/2:p1+p2);
        }
    }
}