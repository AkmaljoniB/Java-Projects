package For_in_For;

import java.util.Scanner;

public class Test_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" "+i);
            }
            System.out.println();
        }
    }
}
