package Codeforces;

import java.util.Scanner;

public class There_are_two_types_of_burgers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int b=sc.nextInt(),p=sc.nextInt(),f=sc.nextInt(),h=sc.nextInt(),c=sc.nextInt(),s=0;
            if (h>c){
                s+=Math.min(p,b/2)*h;
                b-=Math.min(p*2,b);
                s+=Math.min(f,b/2)*c;
            }else {
                s+=Math.min(f,b/2)*c;
                b-=Math.min(f*2,b);
                s+=Math.min(p,b/2)*h;
            }
            System.out.println(s);
        }
    }
}