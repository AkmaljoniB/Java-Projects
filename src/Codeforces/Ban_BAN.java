package Codeforces;

import java.util.Scanner;

public class Ban_BAN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            System.out.println(n/2+n%2);
            for (int i=1;i<=n/2+n%2;i++) {
                System.out.println((3*(i-1)+1)+" "+(n*3-3*(i-1))+" ");
            }
        }
    }
}
