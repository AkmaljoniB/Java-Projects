package Codeforces;

import java.util.Scanner;

public class Catch_a_coin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int x=sc.nextInt(),y=sc.nextInt();
            if(y>=0||x<=y+(x+1)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}