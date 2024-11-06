package Massive;

import java.util.Scanner;

public class Udalenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] arr;
        arr = new long[100];
        int nElement = 10;
        int j;
        long searchKey;

        for (int i = 0; i < nElement; i++) {
            arr[i] = scanner.nextInt();
        }

        for (j = 0; j<nElement; j++)
            System.out.print(arr[j]+" ");
        System.out.println();
        searchKey = 55 ;
        for (j=0; j<nElement; j++) {
            if (arr[j]==searchKey)
                break;
        }
        for (int k = j; k < nElement-1; k++)
            arr[k]=arr[k+1] ;
        nElement -- ;

        for (j=0; j<nElement; j++)
            System.out.print(arr[j]+ " ");
    }
}
