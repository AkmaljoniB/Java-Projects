package Alexeev;

import java.util.Scanner;

public class Alexeev_0778 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]arr =new int[31];
        int a=0;
        for (int i = 0 ;i<31;i++){
            arr[i]=scanner.nextInt();
            a+=arr[i];
        }
        System.out.println(a/27);
    }
}