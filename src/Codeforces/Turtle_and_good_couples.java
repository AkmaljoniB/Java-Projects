package Codeforces;

import java.util.Scanner;

public class Turtle_and_good_couples{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[26];
            String s=sc.next();
            for(int i=0;i<n;i++)arr[s.charAt(i)-'a']++;
            while(n>0){
                for(int i=0;i<26;i++){
                    if(arr[i]!=0){
                        System.out.print((char)('a'+i));
                        arr[i]--;
                        n--;
                    }
                }
            }
            System.out.println();
        }
    }
}