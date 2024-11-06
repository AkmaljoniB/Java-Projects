package Codeforces;

import java.util.Scanner;

public class Phone_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String p=sc.next();
            System.out.println(n<11||!p.substring(0,n-10).contains("8")?"NO":"YES");
        }
    }
}
