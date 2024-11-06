package Massive;

import java.util.Scanner;

public class Udalenie_Minusov {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Razmer Massive: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<arr.length; i++){
            arr[i]= scanner.nextInt();
        }
        printOddNumber(arr);
    }

    private static void printOddNumber(int[] arr) {
        StringBuilder str  = new StringBuilder();
        for (int i : arr){
            if (i > 0){
                str.append(", "+i);
            }
        }
        System.out.println("["+str.deleteCharAt(0)+"]");
    }
}