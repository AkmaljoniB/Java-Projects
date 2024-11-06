package Alexeev;

import java.util.Scanner;

public class Alexeev_0317{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt(),y=sc.nextInt(),z=sc.nextInt(),w=sc.nextInt(),l=0;
        for(int i=0;i<=w/x;i++){
            int q=(w-x*i)/y;
            for(int j=0;j<=q;j++){
                int e=(w-x*i-y*j)/z;
                for(int p=0;p<=e;p++)if(x*i+y*j+z*p==w)l++;
            }
        }
        System.out.println(l);
    }
}