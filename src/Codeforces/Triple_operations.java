package Codeforces;

import java.util.Scanner;

public class Triple_operations{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long l=sc.nextInt(),r=sc.nextInt(),p=l,s=0,w;
            while(p>0){
                p/=3;
                s++;
            }
            int f=(int)s;
            w=(long)Math.pow(3,f);
            s+=f;
            l++;
            while(l<=r){
                if(r>=w){
                    s+=(w-l)*f;
                    l=w;
                    w*=3;
                    f++;
                }else{
                    s+=(r-l+1)*f;
                    break;
                }
            }
            System.out.println(s);
        }
    }
}