package Codeforces;

import java.util.*;

public class Another_permutation_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            for (int i=1;i<=n;i+=2) {
                int j=i;
                while (j<=n){
                    System.out.print(j+" ");
                    j*=2;
                }
            }
            System.out.println();
        }
    }
}