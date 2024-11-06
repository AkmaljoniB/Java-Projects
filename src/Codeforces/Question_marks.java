package Codeforces;

import java.util.Scanner;

public class Question_marks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),arr[]=new int[4],l=0;
            String s=sc.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='?')arr[s.charAt(i)-'A']++;
            }
            for(int i=0;i<4;i++)l+=Math.min(n,arr[i]);
            System.out.println(l);
        }
    }
}