package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0032 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(),s2=sc.next();
        char[]a=s1.toCharArray(),b=s2.toCharArray();
        Arrays.sort(a);Arrays.sort(b);
        int min1=0,min2=0,max1=0,max2=0;
        min1=getMin(s1,a,min1);
        min2=getMin(s2,b,min2);
        for(int i=a.length-1;i>=0;i--){
            if(a[i]!='-')max1=max1*10+a[i]-'0';
        }
        for(int i=b.length-1;i>=0;i--){
            if(b[i]!='-')max2=max2*10+b[i]-'0';
        }
        if(a[0]=='-'){
            min1*=-1;
            max1*=-1;
        }
        if(b[0]=='-'){
            min2*=-1;
            max2*=-1;
        }
        System.out.print(Math.max(Math.max(min1-min2,min1-max2),Math.max(max1-min2,max1-max2)));
    }

    private static int getMin(String s2,char[]b,int min2) {
        for(int i=0;i<b.length;i++){
            if(b[i]!='-'&&b[i]!='0'){
                min2=min2*10+b[i]-'0';
                if(min2!=0&&min2<10)for(int j=0;j<s2.length()-s2.replace("0","").length();j++)min2=min2*10;
            }
        }
        return min2;
    }
}