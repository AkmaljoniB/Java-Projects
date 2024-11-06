package Codeforces;

import java.util.Scanner;

public class Math_problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),sm=0,min=99,l=0;
            String s=sc.next();
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='0')l++;
                else if(s.charAt(i)!='1')sm+=s.charAt(i)-'0';
                if(i!=n-1)min=Math.min(Integer.parseInt(s.substring(i,i+2)),min);
            }
            if(l>1||(l==1&&n>3)||(l==1&&n==3&&s.charAt(1)!='0'))System.out.println(0);
            else{
                if(min%10==1){
                    int p=min;
                    min=101;
                    for(int i=0;i<n-1;i++){
                        if(s.charAt(i+1)!='1')min=Math.min(min,Integer.parseInt(s.substring(i,i+2)));
                    }
                    if(p+min%10<min)min=p;
                }
                if(min/10!=1)sm-=min/10;
                if(min%10!=1)sm-=min%10;
                System.out.println(min==1?Math.max(min,sm):min+sm);
            }
        }
    }
}