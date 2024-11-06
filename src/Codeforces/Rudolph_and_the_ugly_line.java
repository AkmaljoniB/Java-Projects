package Codeforces;

import java.util.Scanner;

public class Rudolph_and_the_ugly_line {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            System.out.println(sc.next().split("map|pie",-1).length-1);
        }
    }
}