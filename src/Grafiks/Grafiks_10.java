package Grafiks;

import java.util.Scanner;

public class Grafiks_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        if (x<=-1 && y<=-2){
            System.out.println("Нуқта дар ҷойи зури бад хобидагияй!!! " + x + " " + y);
        } else {
            System.out.println("Нуқта дар ҷойи безеби бад ховай!!! " + x + " " + y);
        }
    }
}
