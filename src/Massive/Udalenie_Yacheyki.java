package Massive;

import java.util.Arrays;
import java.util.Scanner;

public class Udalenie_Yacheyki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {5, 8, 92, -9, -6, 72, 9, 156, 46, 83};
//        int[]arr1= new int[arr.length-1];
//        System.out.println("Какую ячейку удалить: ");
//        int n = scanner.nextInt();
//        int b =0;
//        arr[n] = 0;
//        for (int i =0; i<arr1.length; i++){
//            if(arr[i] !=0 && b==0){
//                arr1[i]= arr[i];
//            } else {
//                arr1[i] = arr[i+1];
//                b ++;
//            }
//        }
//        System.out.println(Arrays.toString(arr1));
        System.out.println("Какую ячейку удалить: ");
        int n = scanner.nextInt();
        int b;
        System.out.println(Arrays.toString(arr));
        System.out.print("[");
        for (int i = 0; i < arr.length-1; i++) {
            if (i<=3) {
                b = arr[n + i + 1];
                arr[n + i] = b;
            }
            if (i != 8) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");

    }
}
