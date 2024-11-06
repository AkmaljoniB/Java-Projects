package Codeforces;

import java.util.Scanner;

public class Queue_at_the_bus_stop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt(),l=0,k=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            if(l+a>m){
                k++;
                l=0;
            }
            l+=a;
        }
        System.out.println(l!=0?k+1:k);
    }
}