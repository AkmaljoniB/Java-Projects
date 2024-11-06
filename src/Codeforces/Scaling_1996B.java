package Codeforces;

import java.util.Scanner;

public class Scaling_1996B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt();
            for(int i=0;i<n;i++){
                String s=sc.next();
                if(i%k!=0)continue;
                for(int j=0;j<n;j+=k)System.out.print(s.charAt(j));
                System.out.println();
            }
        }
    }
}