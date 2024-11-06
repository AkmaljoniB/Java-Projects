package Task;

import java.util.Scanner;

public class Zarb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 10; i > 0; i--) {
            for (int j = 10; j > 0; j--) {
                System.out.print(j + " * " + i + " = " + (j * i)+"       ");
            }
            System.out.println();
        }
    }
}
