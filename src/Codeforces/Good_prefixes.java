package Codeforces;

import java.util.Scanner;

public class Good_prefixes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(),k=0;
            long s=sc.nextInt();
            int max=(int)s;
            for(int i=1;i<n;i++){
                if(s-max==max)k++;
                int a=sc.nextInt();
                s+=a;
                max=Math.max(max,a);
            }
            if(s-max==max)k++;
            System.out.println(k);
        }
    }
}