package Codeforces;

import java.util.Scanner;

public class Game_of_exchanges {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),min=sc.nextInt();
            String s="Bob";
            for(int i=1;i<n;i++)if(min>sc.nextInt())s="Alice";
            System.out.println(s);
        }
    }
}