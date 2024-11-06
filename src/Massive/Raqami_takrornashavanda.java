package Massive;

import java.util.Scanner;

public class Raqami_takrornashavanda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Razmer masssive: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        boolean flag;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            flag = true;
            for (int i = 0; i < arr.length; i++) {
                if ((arr[j]==arr[i]) && j!=i) {
                    flag = false ;
                    break;
                }
            }
            if (flag){
                System.out.println(arr[j]);
            }
        }
    }
}
