package Codeforces;

import java.util.*;
public class Phone_desktop{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt(),y=sc.nextInt(),l=(y+1)/2*7+y%2*4;
            System.out.println(x>=l?(y+1)/2+(x-l+14)/15:(y+1)/2);
        }
    }
}