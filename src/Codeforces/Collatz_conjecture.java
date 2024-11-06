package Codeforces;

import java.util.Scanner;

public class Collatz_conjecture {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt(),y=sc.nextInt(),k=sc.nextInt();
            while(k>0){
                if(y-x%y<=k){
                    k-=y-x%y;
                    x+=y-x%y;
                }else{
                    x+=k;
                    k=0;
                }
                while(x%y==0)x/=y;
                if(x==1){
                    x=1+k%(y-1);
                    break;
                }
            }
            System.out.println(x);
        }
    }
}
