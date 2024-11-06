package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class A_very_different_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),m=sc.nextInt(),r=m-1,l=0,p=n-1;
            Integer[]a=new Integer[n],b=new Integer[m];
            for (int i=0;i <n;i++)a[i]=sc.nextInt();
            for (int i=0;i <m;i++)b[i]=sc.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            long s=0;
            for (int i=0;i<=p;) {
                if (Math.abs(a[i]-b[r])>=Math.abs(a[i]-b[l])){
                    s+=Math.abs(a[i]-b[r]);
                    r--;
                    i++;
                }else {
                    s+=Math.abs(a[p]-b[l]);
                    l++;
                    p--;
                }
            }
            System.out.println(s);
        }
    }
}
//4 6 8 10
//1 3 6 8 9 10
//6+9+5+3