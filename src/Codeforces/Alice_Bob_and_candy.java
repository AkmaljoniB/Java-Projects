package Codeforces;

import java.util.Scanner;

public class Alice_Bob_and_candy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int[]arr =new int[n];
            for (int i = 0; i < n; i++) arr[i]=scanner.nextInt();
            int a =0,b=0,k=0,p=0,i=0,j=n-1;
            while (i<=j){
                int s=0;
                if (k%2==0){
                    while (i <=j) {
                        s+=arr[i];
                        i++;
                        if (s>p){
                            p=s;
                            break;
                        }
                    }
                    a+=s;
                } else {
                    while (j>=i) {
                        s+=arr[j];
                        j--;
                        if (s>p){
                            p=s;
                            break;
                        }
                    }
                    b+=s;
                }
                k++;
            }
            System.out.println(k+" "+a+" "+b);
        }
    }
}
