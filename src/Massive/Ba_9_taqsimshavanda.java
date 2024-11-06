package Massive;

import java.util.Scanner;

public class Ba_9_taqsimshavanda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Ba 9 taqsimshavanda");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 9 == 0){
                s++ ;
                System.out.println(arr[i]);
            }
        }
        if (s==0){
            System.out.println(" nest");
        }
        System.out.println("shumoraashon: "+s);
    }
}