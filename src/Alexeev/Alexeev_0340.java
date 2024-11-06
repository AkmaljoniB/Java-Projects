package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0340 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] =new int[3];
        int arr1[] =new int[3];
        for (int i =0; i<3;i++){
            arr[i] =scanner.nextInt();
        }
        for (int i =0; i<3;i++){
            arr1[i] =scanner.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if (Arrays.equals(arr,arr1)){
            System.out.println("Boxes are equal");
        } else if (arr[0]>=arr1[0] && arr[1]>= arr1[1] && arr[2]>=arr1[2]){
            System.out.println("The first box is larger than the second one");
        } else if (arr[0]<=arr1[0] && arr[1]<= arr1[1] && arr[2]<=arr1[2]){
            System.out.println("The first box is smaller than the second one");
        } else {
            System.out.println("Boxes are incomparable");
        }
    }
}