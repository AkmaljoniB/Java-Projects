package Codeforces;

import java.util.Scanner;

public class Little_Nikita {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt();
            System.out.println(n>=m&&(n-m)%2==0?"YES":"NO");
        }
    }
}