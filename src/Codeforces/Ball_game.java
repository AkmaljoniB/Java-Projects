package Codeforces;

import java.util.Scanner;

public class Ball_game{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=1;
        for(int i=1;i<n;i++){
            l+=i;
            System.out.print(l%n==0?n+" ":l%n+" ");
        }
    }
}
