package Codeforces;

import java.util.Scanner;

public class Uroki_disayna_zadach_uchimsya_u_matematiki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n%2==0){
            System.out.println(n-4);
            System.out.println(4);
        } else{
            System.out.println(n-9);
            System.out.println(9);
        }
    }
}