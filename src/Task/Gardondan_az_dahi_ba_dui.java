package Task;

import java.util.Scanner;

public class Gardondan_az_dahi_ba_dui {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b;
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        System.out.println(temp);
    }
}