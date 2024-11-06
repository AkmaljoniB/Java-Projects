package Codeforces;

import java.util.Scanner;

public class Summa_kruglikh_chisel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[6];
            int l = 0;
            while (n != 0) {
                if (n % 10 != 0) {
                    for (int j = 0; j < 6; j++) {
                        if (arr[j] == 0) {
                            arr[j] = n % 10;
                            break;
                        }
                    }
                    l++;
                } else {
                    for (int j = 0; j < 6; j++) {
                        if (arr[j] == 0) {
                            arr[j] = -1;
                            break;
                        }
                    }
                }
                n /= 10;
            }
            System.out.println(l);
            for (int j = 0 ; j  <6;j++){
                if (arr[j]!=-1 && arr[j]!=0){
                    String s ="1";
                    for (int k = 0;k<j;k++){
                        s=s.concat("0");
                    }
                    System.out.println(arr[j]*Integer.parseInt(s));
                }
            }
        }
    }
}