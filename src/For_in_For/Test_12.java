package For_in_For;

import java.util.Scanner;

public class Test_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println("/");
        }

        for (int i = 1; i < 6; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.print("\\          \\");

            for (int k = 0; k < i; k++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.print("/          /");

            for (int k = 0; k < i; k++) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
    }
}