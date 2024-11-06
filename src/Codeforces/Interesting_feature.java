package Codeforces;

import java.util.Scanner;

public class Interesting_feature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int l=sc.nextInt(),r=sc.nextInt(),k=0;
            while (r>0){
                k+=r-l;
                r/=10;
                l/=10;
            }
            System.out.println(k);
        }
    }
}
