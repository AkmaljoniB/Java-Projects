package Codeforces;

import java.util.Scanner;

public class Jean_s_blender {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),x=Math.min(sc.nextInt(),sc.nextInt());
            System.out.println((n+x-1)/x);
        }
    }
}