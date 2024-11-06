package Codeforces;

import java.util.Scanner;

public class Good_matrix_elements_1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int a=sc.nextInt();
                if(i==j||i==n-1-j||i==n/2||j==n/2)s+=a;
            }
        }
        System.out.println(s);
    }
}