package Codeforces;

import java.util.*;

public class Victory_goals{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),s=0;
            for(int i=1;i<n;i++)s+=sc.nextInt();
            System.out.println(-s);
        }
    }
}