package Codeforces;

import java.util.*;
public class Task_generator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),a[]=new int[7],k=0;
            String s=sc.next();
            for(int i=0;i<n;i++)a[s.charAt(i)-'A']++;
            for(int i=0;i<7;i++)k+=Math.max(m-a[i],0);
            System.out.println(k);
        }
    }
}