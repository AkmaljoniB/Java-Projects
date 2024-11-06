package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Twin_permutations {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        PrintWriter pr=new PrintWriter(System.out);
        for (int t=sc.nextInt();t-->0;){
            int n=sc.nextInt();
            for (int i=0;i<n;i++)pr.print(Math.abs(n-sc.nextInt()+1)+" ");
            pr.println();
        }
        pr.close();
    }
}