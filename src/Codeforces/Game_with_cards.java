package Codeforces;

import java.util.Scanner;

public class Game_with_cards {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),max1=0;
            while (n-->0)max1=Math.max(max1,sc.nextInt());
            int m=sc.nextInt(),max2=0;
            while (m-->0)max2=Math.max(max2,sc.nextInt());
            if (max1>max2) System.out.println("Alice\nAlice");
            else if (max1<max2) System.out.println("Bob\nBob");
            else System.out.println("Alice\nBob");
        }
    }
}
