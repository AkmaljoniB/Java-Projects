package Codeforces;

import java.util.Scanner;

public class Marafon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k=0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            int d = scanner.nextInt();
            if (a<b){
                k++;
            }
            if (a<c){
                k++;
            }
            if (a<d){
                k++;
            }
            System.out.println(k);
            k=0;
        }
    }
}
