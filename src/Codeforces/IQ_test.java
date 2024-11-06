package Codeforces;

import java.util.Scanner;

public class IQ_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int a =0,b=0,l =0,j=0;
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
            if (arr[i]%2==0){
                a++;
                j = i;
            }
            if (arr[i]%2!=0){
                b++;
                l = i;
            }
            if (a>1 && b==1){
                System.out.println(l+1);
                break;
            } else if (a==1 && b>1){
                System.out.println(j+1);
                break;
            }
        }
    }
}