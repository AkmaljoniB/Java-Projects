package Codeforces;

import java.util.Scanner;

public class Yura_i_zaselenie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 0;
        for (int i = 0;i<n;i++){
            int p = scanner.nextInt();
            int q = scanner.nextInt();
            if (q-p>=2){
                k++;
            }
        }
        System.out.println(k);
    }
}