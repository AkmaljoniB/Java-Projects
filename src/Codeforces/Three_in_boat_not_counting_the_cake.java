package Codeforces;

import java.util.Scanner;

public class Three_in_boat_not_counting_the_cake{
    static int l=0,r=0,n;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            long[]a=new long[n+1],b=new long[n+1],c=new long[n+1];
            for(int i=1;i<=n;i++)a[i]=a[i-1]+sc.nextInt();
            for(int i=1;i<=n;i++)b[i]=b[i-1]+sc.nextInt();
            for(int i=1;i<=n;i++)c[i]=c[i-1]+sc.nextInt();
            if(func(a,b,c))System.out.println(1+" "+l+" "+(l+1)+" "+r+" "+(r+1)+" "+n);
            else if(func(a,c,b))System.out.println(1+" "+l+" "+(r+1)+" "+n+" "+(l+1)+" "+r);
            else if(func(b,c,a))System.out.println((r+1)+" "+n+" "+1+" "+l+" "+(l+1)+" "+r);
            else if(func(b,a,c))System.out.println((l+1)+" "+r+" "+1+" "+l+" "+(r+1)+" "+n);
            else if(func(c,a,b))System.out.println((l+1)+" "+r+" "+(r+1)+" "+n+" "+1+" "+l);
            else if(func(c,b,a))System.out.println((r+1)+" "+n+" "+(l+1)+" "+r+" "+1+" "+l);
            else System.out.println(-1);
        }
    }
    static boolean func(long[]a,long[]b,long[]c){
        out:for(int i=1;i<=n;i++){
            if(a[i]-a[0]>=(a[n]+2)/3){
                for(int j=i+1;j<=n;j++){
                    if(b[j]-b[i]>=(b[n]+2)/3){
                        if(c[n]-c[j]>=(c[n]+2)/3){
                            l=i;
                            r=j;
                            return true;
                        }
                        break out;
                    }
                }
                break;
            }
        }
        return false;
    }
}