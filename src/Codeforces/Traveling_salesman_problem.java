package Codeforces;

import java.util.Scanner;

public class Traveling_salesman_problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int max1=0,max2=0,min1=0,min2=0;
            for (int i=0;i<n;i++) {
                int x=sc.nextInt(),y=sc.nextInt();
                max1=Math.max(max1,x);
                max2=Math.max(max2,y);
                if (x<min1)min1=x;
                if (y<min2)min2=y;
            }
            System.out.println((max1+max2-min1-min1)*2);
        }
    }
}
