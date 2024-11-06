package Codeforces;

import java.util.Scanner;

public class Gift_from_orangutan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),max=0,min=1001;
            for(int i=0;i<n;i++){
                int a=sc.nextInt();
                max=Math.max(max,a);
                min=Math.min(min,a);
            }
            System.out.println((max-min)*(n-1));
        }
    }
}