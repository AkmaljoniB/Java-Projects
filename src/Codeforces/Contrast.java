package Codeforces;

import java.util.Scanner;

public class Contrast{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),l=0,p=0,a=sc.nextInt();
            for(int i=1;i<n;i++){
                int b=sc.nextInt();
                if(a<b&&p!=2){
                    l++;
                    p=2;
                }
                if(a>b&&p!=1){
                    l++;
                    p=1;
                }
                a=b;
            }
            System.out.println(l+1);
        }
    }
}