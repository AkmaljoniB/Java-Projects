package Codeforces;

import java.util.Scanner;

public class Not_coprime_partition{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<3)System.out.println("No");
        else{
            int p=(n*(n+1)/2),l=2;
            System.out.println("Yes");
            if(p%2==0)System.out.println("1 2");
            else{
                for(int i=3;i<n;i+=2){
                    if(p%i==0){
                        System.out.println("1 "+i);
                        l=i;
                        break;
                    }
                }
            }
            System.out.print(n-1 +" ");
            for(int i=1;i<l;i++) System.out.print(i+" ");
            for(int i=l+1;i<=n;i++) System.out.print(i+" ");
        }
    }
}