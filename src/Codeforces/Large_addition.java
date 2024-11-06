package Codeforces;

import java.util.Scanner;

public class Large_addition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long x=sc.nextLong(),l=(x+"").length(),p=9,w=1;
            for(int i=2;i<l;i++){
                p=p*10+9;
                w=w*10+1;
            }
            w*=10;
            String q=x+"";
            if((x<=p*2&&x>=w)&&x%10!=9&&!q.substring(0,q.length()-1).contains("0"))System.out.println("YES");
            else System.out.println("NO");
        }
    }
}