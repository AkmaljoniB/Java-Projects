package Codeforces;

import java.util.*;
public class Remove_two_characters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),p=n-1;
            String s=sc.next();
            for (int i=0;i<n-2;i++)if (s.charAt(i)==s.charAt(i+2))p--;
            System.out.println(p);
        }
    }
}