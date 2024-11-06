package Massive;

import java.util.Scanner;

public class Maximuma_yacheika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        int max = Integer.MIN_VALUE;
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i]= scanner.nextInt();
            if (max<arr[i]){
                max = arr[i];
                s = i ;
            }
        }
        System.out.println("Yacheika: "+s);
        System.out.println("Max: "+max);
    }
}
