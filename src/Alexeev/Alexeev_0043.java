package Alexeev;

import java.util.Scanner;

public class Alexeev_0043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 0, m = 0;
        String s = scanner.nextLine();
        char[] chararray = s.toCharArray();
        for (char element : chararray) {
            if (element == '0') {
                c++;
            } else {
                c = 0;
            }
            if (c > m) {
                m = c ;
            }
        }
        System.out.println(m);
    }
}