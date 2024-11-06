package Codeforces;

import java.util.Scanner;

public class Cowardly_Rooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int t=sc.nextInt();t-->0;){
            int n=sc.nextInt(),m=sc.nextInt();
            String s=n>m?"YES":"NO";
            while (m-->0){
                sc.nextInt();
                sc.nextInt();
            }
            System.out.println(s);
        }
    }
}