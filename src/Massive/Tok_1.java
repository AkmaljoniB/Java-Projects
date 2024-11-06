package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Tok_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (i%2==0){
                if (arr[i]!=i){
                    System.out.print("[ "+arr[i]+" ]  ");
                    System.out.print("[ "+0+" ]  ");
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
