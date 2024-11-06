package Codeforces;

import java.util.Scanner;

public class Two_pow_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),a=sc.nextInt(),l=1,res=0;
            for(int i=1;i<n;i++){
                int b=sc.nextInt();
                if(a<b*2)l++;
                else{
                    res+=Math.max(l-k,0);
                    l=1;
                }
                a=b;
            }
            res+=Math.max(l-k,0);
            System.out.println(res);
        }
    }
}