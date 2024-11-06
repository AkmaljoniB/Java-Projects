package Codeforces;

import java.util.Scanner;

public class S_A_Deviation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int s=sc.nextInt()+sc.nextInt()+sc.nextInt();
            System.out.println(s/3*2==s-s/3?0:1);
        }
    }
}
