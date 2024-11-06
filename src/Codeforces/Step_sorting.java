package Codeforces;

import java.util.Scanner;

public class Step_sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=sc.nextInt(),l=0;
            for (int i=1;i<=n;i++) {
                int a=sc.nextInt();
                if (Math.abs(a-i)%k!=0)l++;
            }
            System.out.println(l==2?1:l==0?0:-1);
        }
    }
}
