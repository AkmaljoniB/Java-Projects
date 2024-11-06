package Codeforces;

import java.util.Scanner;

public class Find_K_distinct_points_with_fixed_center{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt(),y=sc.nextInt(),k=sc.nextInt();
            for(int i=1;i<k;i++)System.out.println((x+i)+" "+(y+i));
            System.out.println((x-(k*(k-1)/2))+" "+(y-(k*(k-1)/2)));
        }
    }
}