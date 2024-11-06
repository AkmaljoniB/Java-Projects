package Codeforces;

import java.util.Scanner;

public class Coins_47B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next(),b=sc.next(),c=sc.next(),s="Impossible";
        int arr[]=new int[3];
        if(a.charAt(1)=='>')arr[a.charAt(0)-'A']++;
        else arr[a.charAt(2)-'A']++;
        if(b.charAt(1)=='>')arr[b.charAt(0)-'A']++;
        else arr[b.charAt(2)-'A']++;
        if(c.charAt(1)=='>')arr[c.charAt(0)-'A']++;
        else arr[c.charAt(2)-'A']++;
        if(Math.max(arr[0],Math.max(arr[1],arr[2]))==2){
            if(arr[0]==2)s="A";
            else if(arr[1]==2)s="B";
            else s="C";
            if(arr[0]==1)s="A"+s;
            else if(arr[1]==1)s="B"+s;
            else s="C"+s;
            if(arr[0]==0)s="A"+s;
            else if(arr[1]==0)s="B"+s;
            else s="C"+s;
        }
        System.out.println(s);
    }
}