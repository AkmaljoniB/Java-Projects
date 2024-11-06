package Task;

import java.util.Scanner;

public class Gardondan_az_dahi_ba_dui_va_hisob_kardani_yak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b, c = 0;
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
            if (b == 1) {
                c++;
            }
        }
        System.out.println(temp);
        System.out.println(c);
    }
}