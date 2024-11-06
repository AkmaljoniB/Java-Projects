package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Number_on_the_board {
    public static void main(String[] args) {
        PrintWriter pr=new PrintWriter(System.out);
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            pr.println("2\n"+n+" "+(n-1));
            for (int i=n;i>2;i--) pr.println(i+" "+(i-2));
        } pr.close();
    }
}