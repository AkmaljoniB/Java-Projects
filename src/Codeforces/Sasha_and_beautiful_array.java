package Codeforces;

import java.util.Scanner;

public class Sasha_and_beautiful_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n = sc.nextInt(),min=sc.nextInt(),max=min;
            for (int i=1;i<n;i++){
                int a=sc.nextInt();
                min=Math.min(min,a);
                max=Math.max(max,a);
            }
            System.out.println(max-min);
        }
    }
}
