package Codeforces;

import java.util.Scanner;

public class Smallest_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt(),min=Long.MAX_VALUE,l1=0,l2=0,l3=0;
        if(sc.next().equals("+"))l1++;
        if(sc.next().equals("+"))l2++;
        if(sc.next().equals("+"))l3++;
        if(l1+l2+l3==3)min=a+b+c+d;
        else if(l1+l2+l3==2){
            if(l3==1)min=Math.min(Math.min(Math.min(a*b+c+d,a*c+b+d),a*d+b+c),Math.min(Math.min(b*c+d+a,b*d+a+c),c*d+a+b));
            if(l2==0){
                min=Math.min(Math.min((b+c)*a+d,(c+d)*a+b),Math.min((b+d)*a+c,min));
                min=Math.min(Math.min((a+c)*b+d,(a+d)*b+c),Math.min((c+d)*b+a,min));
                min=Math.min(Math.min((a+b)*c+d,(a+d)*c+b),Math.min((b+d)*c+a,min));
                min=Math.min(Math.min((a+b)*d+c,(a+c)*d+b),Math.min((b+c)*d+a,min));
            }
            if(l3==0)min=Math.min(Math.min((a+b+c)*d,(a+b+d)*c),Math.min((a+c+d)*b,Math.min((b+c+d)*a,min)));
        }else if(l1+l2+l3==1){
            if(l1==1)min=Math.min(Math.min((a+b)*c*d,Math.min((a+c)*b*d,(a+d)*b*c)),Math.min(Math.min((b+c)*d*a,(b+d)*a*c),Math.min((c+d)*b*a,min)));
            else if(l2==1){
                min=Math.min(Math.min(Math.min((a*b+c)*d,(a*c+b)*d),((b*c)+a)*d),min);
                min=Math.min(Math.min(Math.min((a*b+d)*c,(a*d+b)*c),((b*d)+a)*c),min);
                min=Math.min(Math.min(Math.min((a*d+c)*b,(a*c+d)*b),((d*c)+a)*b),min);
                min=Math.min(Math.min(Math.min((d*b+c)*a,(d*c+b)*a),((b*c)+d)*a),min);
            }else{
                min=Math.min(Math.min(a*b+c*d,a*c+b*d),Math.min(a*d+b*c,min));
                min=Math.min(Math.min(a*b*c+d,a*b*d+c),Math.min(Math.min(a*c*d+b,b*c*d+a),min));
            }
        }else min=a*b*c*d;
        System.out.println(min);
    }
}