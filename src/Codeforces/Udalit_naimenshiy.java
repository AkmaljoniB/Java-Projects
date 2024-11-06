package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Udalit_naimenshiy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int[] arr = new int[a];
            for (int j = 0; j < a; j++) {
                arr[j] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int k=0;
            for (int i1=0;i1<arr.length-1;i1++){
                if (arr[i1]+1==arr[i1+1] || arr[i1]==arr[i1+1]){
                    k++;
                }
            }
            if (k+1==arr.length){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
            k=0;
        }
    }
}