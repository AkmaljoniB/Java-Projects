package Codeforces;

import java.util.Scanner;

public class Vanya_i_Zabor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int a;
        int b =0;
        for (int i = 0; i < n; i++){
            a = scanner.nextInt();
            if (a<=h){
                b++;
            } else {
                b = b+2;
            }
        }
        System.out.println(b);
    }
}