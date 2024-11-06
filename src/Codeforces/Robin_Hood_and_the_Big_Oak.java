package Codeforces;

import java.util.Scanner;

public class Robin_Hood_and_the_Big_Oak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),s=(n-k+1+n)*(n-(n-k+1)+1)/2;
            System.out.println(s%2==0?"YES":"NO");
        }
    }
}