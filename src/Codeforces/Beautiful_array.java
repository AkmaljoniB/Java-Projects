package Codeforces;

import java.util.Scanner;

public class Beautiful_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextInt(),k=sc.nextInt(),b=sc.nextInt(),s=sc.nextLong();
            if((s-(n-1)*(k-1))/k<=b&&b<=s/k){
                for(int i=0;i<n;i++){
                    if(s/k>b){
                        s-=k-1;
                        System.out.print(k-1 +" ");
                    }else if (s/k==b){
                        System.out.print(s+" ");
                        s=0;
                    }else System.out.print("0 ");
                }
                System.out.println();
            }else System.out.println(-1);
        }
    }
}