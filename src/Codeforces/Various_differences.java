package Codeforces;

import java.util.Scanner;

public class Various_differences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int t=sc.nextInt();t-->0;){
            int k=sc.nextInt(),n=sc.nextInt(),l=2,p=2;
            System.out.print("1 ");
            for(int i=1;i<k;i++){
                if(n-l+1>=k-i){
                    System.out.print(l+" ");
                    l+=p;
                    p++;
                }else {
                    l++;
                    System.out.print((l-p+1)+" ");
                }
            }
            System.out.println();
        }
    }
}