package Codeforces;

import java.util.Scanner;

public class Angry_schoolchildren {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),max=0,k=-1;
            String s=sc.next();
            for(int i=0;i<n;i++){
                if (k!=-1)k++;
                if(s.charAt(i)=='A'){
                    max=Math.max(max,k-1);
                    k=0;
                }
            }
            System.out.println(Math.max(max,k));
        }
    }
}