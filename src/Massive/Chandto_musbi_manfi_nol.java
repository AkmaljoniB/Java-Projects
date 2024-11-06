package Massive;

import java.util.Scanner;

public class Chandto_musbi_manfi_nol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]arr = new int[n];
        int musbi = 0;
        int manfi = 0;
        int nol = 0;
        for (int i = 0; i <arr.length; i++){
            arr[i]= scanner.nextInt();
            if (arr[i]>0){
                musbi ++ ;
            }
            if (arr[i]<0){
                manfi ++ ;
            }
            if (arr[i]==0){
                nol++ ;
            }
        }
        System.out.println("manfi" +manfi);
        System.out.println("musbi: " + musbi);
        System.out.println("nol: "+nol);
    }
}
