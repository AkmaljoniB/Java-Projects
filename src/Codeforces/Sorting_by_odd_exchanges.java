package Codeforces;

import java.util.*;

public class Sorting_by_odd_exchanges {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),b=0,c=0;
            String s="Yes";
            for (int i=0;i<n;i++){
                int a=sc.nextInt();
                if (a%2==0){
                    if (b>a)s="No";
                    b=a;
                }else {
                    if (c>a)s="No";
                    c=a;
                }
            }
            System.out.println(s);
        }
    }
}