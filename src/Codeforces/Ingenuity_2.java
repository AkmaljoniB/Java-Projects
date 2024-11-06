package Codeforces;

import java.util.Scanner;

public class Ingenuity_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            StringBuilder sb=new StringBuilder();
            int a1=0,a2=0,a3=1,a4=1,N=0,S=0,E=0,W=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='N'){
                    sb.append("RH".charAt(a1));
                    a1=1-a1;
                    N++;
                }else if(s.charAt(i)=='S'){
                    sb.append("RH".charAt(a2));
                    a2=1-a2;
                    S++;
                }else if(s.charAt(i)=='E'){
                    sb.append("RH".charAt(a3));
                    a3=1-a3;
                    E++;
                }else{
                    sb.append("RH".charAt(a4));
                    a4=1-a4;
                    W++;
                }
            }
            System.out.println((N>1||S>1||E>1||W>1||(N==1&&N==S&&E==W&&E==1))&&a1==a2&&a3==a4?sb:"NO");
        }
    }
}