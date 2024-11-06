package Codeforces;

import java.util.Scanner;

public class Sheep_ordering {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.next();
            int l=s.indexOf("*"),r=s.lastIndexOf("*");
            if(l!=-1){
                long k=0,p=0,q1=1,q2=0;
                for(int j=l+1;j<=r;j++){
                    if(s.charAt(j)=='.')p++;
                    else {
                        q2++;
                        k+=p;
                    }
                }
                long min=k;
                for(int i=l+1;i<=r;i++){
                    if(s.charAt(i)=='.'){
                        k+=q1;
                        k-=q2;
                    }else{
                        q1++;
                        q2--;
                    }
                    min=Math.min(min,k);
                }
                System.out.println(min);
            }else System.out.println(0);
        }
    }
}