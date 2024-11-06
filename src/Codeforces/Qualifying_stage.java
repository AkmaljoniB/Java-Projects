package Codeforces;

import java.util.Scanner;

public class Qualifying_stage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
            System.out.println(Math.max(c+d,a+b));
        }
    }
}