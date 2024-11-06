package Codeforces;

import java.util.Scanner;

public class ABBB{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int f=0,k=0;
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)=='A'){
                    if(f!=0)f--;
                    else k++;
                }else f++;
            }
            System.out.println(k+f%2);
        }
    }
}