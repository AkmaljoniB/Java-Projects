package Codeforces;

import java.util.Scanner;

public class Vasya_i_moneti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t --> 0){
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            if (a==0){
                System.out.println(1);
            } else {
                System.out.println(b*2+a+1);
            }
        }
    }
}