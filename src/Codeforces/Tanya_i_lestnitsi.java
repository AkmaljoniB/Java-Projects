package Codeforces;

import java.util.Scanner;

public class Tanya_i_lestnitsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        String s= "";
        int k =0;
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
            if (arr[i]==1 && i!=0){
                s=s.concat(String.valueOf(arr[i-1])).concat(" ");
                k++;
            }
        }
        System.out.println(k+1);
        s=s.concat(String.valueOf(arr[n-1]));
        System.out.println(s);
    }
}
