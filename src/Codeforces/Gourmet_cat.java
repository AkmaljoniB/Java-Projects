package Codeforces;

import java.util.Scanner;

public class Gourmet_cat{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),s=Math.min(a/3,Math.min(b/2,c/2)),max=0;
        a-=3*s;b-=2*s;c-=2*s;s*=7;
        for(int i=1;i<=7;i++){
            int a1=a,b1=b,c1=c,l=i,m=0;
            while(true){
                if((a1!=0)&&(l==1||l==4||l==7))a1--;
                else if(b1!=0&&(l==2||l==6))b1--;
                else if(c1!=0&&(l==3||l==5))c1--;
                else break;
                l=l<7?l+1:1;
                m++;
            }
            max=Math.max(max,m);
        }
        System.out.println(s+max);
    }
}