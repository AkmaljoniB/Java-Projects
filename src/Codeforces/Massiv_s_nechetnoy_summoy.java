package Codeforces;

import java.util.Scanner;

public class Massiv_s_nechetnoy_summoy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        for (int i=0;i<t;i++){
            int n= scanner.nextInt();
            int [] arr=new int[n];
            int s=0;
            int k=0;
            int f=0;
            for (int j=0;j<arr.length;j++){
                arr[j]=scanner.nextInt();
                s+=arr[j];
                if (arr[j]%2!=0){
                    k++;
                }else {
                    f++;
                }
            }
            if (s%2!=0){
                System.out.println("YES");
            }else {
                if (k>=1 && f>=1 ){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }
}
