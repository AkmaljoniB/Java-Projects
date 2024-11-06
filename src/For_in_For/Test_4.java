package For_in_For;

import java.util.Scanner;

public class Test_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = 40;
        for (int i = 0; i < 5; i++) {

            for (int j = 1; j < 11; j++) {
                System.out.print(" "+(c+j));
            }
            c = c +10;

            System.out.println();
        }
    }
}
