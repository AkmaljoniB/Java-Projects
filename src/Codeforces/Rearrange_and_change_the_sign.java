package Codeforces;

import java.util.*;

public class Rearrange_and_change_the_sign {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),s=0;
            while (n-->0)s+=Math.abs(sc.nextInt());
            System.out.println(s);
        }
    }
}