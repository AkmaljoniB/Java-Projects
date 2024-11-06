package Codeforces;

import java.util.Scanner;

public class Buying_jewelry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long n=sc.nextLong(),k=sc.nextLong();
            if(n>=k&&n/(n/k)==k) System.out.println("YES\n1\n"+(n/k));
            else{
                if(n-k+1!=0&&n/(n-k+1)==1)System.out.println("YES\n2\n"+(n-k+1)+" 1");
                else System.out.println("NO");
            }
        }
    }
}