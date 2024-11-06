package Codeforces;

import java.util.Scanner;

public class Bliznitsi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = 1;
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            for (int i1 = 0; i1 < arr.length; i1++) {
                arr1 = arr ;
                if (arr1[i1]==arr[i] && i!=i1){
                  p++ ;
                }
                break;
            }
        }
        System.out.println(p);
    }
}
