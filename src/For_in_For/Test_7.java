package For_in_For;

import java.util.Scanner;

public class Test_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (double i = 13; i > 7; i--) {

            for (double j = 8; j < i; j++) {
                System.out.print("  " + (j + i-1));
            }
            System.out.println();
        }
    }
}