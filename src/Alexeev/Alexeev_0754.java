package Alexeev;

import java.util.Scanner;

public class Alexeev_0754 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int m3 = scanner.nextInt();
        if (m1 >= 94 && m2 >= 94 && m3 >= 94 && m1 <= 727 && m2 <= 727 && m3 <= 727) {
            if (m1 >= m2 && m1 >= m3) {
                System.out.println(m1);
            } else if (m2>=m1 && m2>=m3){
                System.out.println(m2);
            } else {
                System.out.println(m3);
            }
        } else {
            System.out.println("Error");
        }
    }
}
