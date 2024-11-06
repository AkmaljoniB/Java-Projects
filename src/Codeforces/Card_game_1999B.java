package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Card_game_1999B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int[]a={sc.nextInt(),sc.nextInt()},b={sc.nextInt(),sc.nextInt()};
            Arrays.sort(a);Arrays.sort(b);
            if((a[1]>b[1]&&a[0]>=b[1])||(a[1]>=b[1]&&a[0]>=b[1]&&a[0]>b[0]))System.out.println(4);
            else if((a[1]>b[1]&&a[0]>=b[0])||(a[1]>=b[1]&&a[0]>b[0])) System.out.println(2);
            else System.out.println(0);
        }
    }
}