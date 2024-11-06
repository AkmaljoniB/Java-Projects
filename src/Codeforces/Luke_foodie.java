package Codeforces;

import java.util.Scanner;

public class Luke_foodie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            int n=sc.nextInt(),x=sc.nextInt(),min=Integer.MAX_VALUE,max=0,k=0;
            for (int i=0;i<n;i++) {
                int a=sc.nextInt();
                min=Math.min(min,a);
                max=Math.max(max,a);
                if (max-min>x*2){
                    k++;
                    min=a;
                    max=a;
                }
            }
            System.out.println(k);
        }
    }
}