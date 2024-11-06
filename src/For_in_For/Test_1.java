package For_in_For;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            for (int j = 5; j > i; j--) {
                System.out.print(" 5 ");
            }
            System.out.println();
        }
    }
}