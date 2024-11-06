package Codeforces;

import java.util.Scanner;

public class Shifts_and_sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long l=0,k=0;
            String s=sc.next();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1')l++;
                else if(l!=0)k+=l+1;
            }
            System.out.println(k);
        }
    }
}