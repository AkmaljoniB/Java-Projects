package Codeforces;

import java.util.Scanner;

public class Li_Hua_and_the_labyrinth{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),x1=sc.nextInt(),y1=sc.nextInt(),x2=sc.nextInt(),y2=sc.nextInt(),min1=4,min2=4;
            if(x1==1||x1==n)min1--;
            if(y1==1||y1==m)min1--;
            if(x2==1||x2==n)min2--;
            if(y2==1||y2==m)min2--;
            System.out.println(Math.min(min1,min2));
        }
    }
}