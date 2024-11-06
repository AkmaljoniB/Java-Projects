package For_in_For;

import java.util.Scanner;

public class Test_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 5; i < 10; i++) {

            for (int j = 10; j > i; j--) {
                 System.out.print("  "+i);
            }
            System.out.println();
        }
    }
}
