package Codeforces;

import java.util.Scanner;

public class Long_multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            char[]x=sc.next().toCharArray(),y=sc.next().toCharArray();
            int l=-1;
            for(int i=0;i<x.length;i++){
                if(l==-1){
                    if(x[i]>y[i])l=0;
                    else if(x[i]<y[i])l=1;
                }else{
                    int c=Math.min(x[i],y[i]);
                    if(l==0){
                        y[i]=(char)Math.max(x[i],y[i]);
                        x[i]=(char)c;
                    }else{
                        x[i]=(char)Math.max(x[i],y[i]);
                        y[i]=(char)c;
                    }
                }
            }
            StringBuilder a=new StringBuilder(),b=new StringBuilder();
            for(int i=0;i<x.length;i++){
                a.append(x[i]-'0');
                b.append(y[i]-'0');
            }
            System.out.println(a+"\n"+b);
        }
    }
}
