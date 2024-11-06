package Codeforces;

import java.util.Scanner;

public class Lots_of_Dora{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt(),r=sc.nextInt();
            l+=1-l%2;
            System.out.println((r-l+2)/4);
        }
    }
}