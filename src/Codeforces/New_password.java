package Codeforces;

import java.util.Scanner;

public class New_password{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="qwertyuiopasdfghjklzxcvbnm";
        int n=sc.nextInt(),k=sc.nextInt(),l=n-k;
        for(int i=0;i<k;i++)System.out.print(s.charAt(i));
        while(l>0){
            for(int i=0;i<Math.min(l,k);i++)System.out.print(s.charAt(i));
            l-=k;
        }
    }
}