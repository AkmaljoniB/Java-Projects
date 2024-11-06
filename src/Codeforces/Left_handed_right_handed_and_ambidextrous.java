package Codeforces;

import java.util.Scanner;

public class Left_handed_right_handed_and_ambidextrous {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt(),r=sc.nextInt(),a=sc.nextInt(),min=Math.min(l,r),max=Math.max(l,r);
        System.out.println(min+a>=max?min+max+a-(min+max+a)%2:(min+a)*2);
    }
}