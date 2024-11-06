package Codeforces;

import java.util.Scanner;

public class Perfect_team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long c=sc.nextInt(),m=sc.nextInt(),x=sc.nextInt(),min=Math.min(c,m),l=(min-(x+c+m-min*2))%3!=0?(min-(x+c+m-min*2))/3+1:(min-(x+c+m-min*2))/3;
            if (min>x+c+m-min*2)min=Math.min(l*2+x+c+m-min*2,min-l);
            System.out.println(min);
        }
    }
}