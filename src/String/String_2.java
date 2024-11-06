package String;

import java.util.Scanner;

public class String_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "Matematica";
        String s2 = s.substring(0, 2);
        String s4 = s2.toLowerCase();
        String s3 = s.substring(2, 9);
        String s1 = scanner.nextLine();
        String s5 = s.substring(0, 7);
        String s6 = s5.toUpperCase();
        if (s.equalsIgnoreCase(s1)) {
            System.out.println(s6);
        } else {
            System.out.println(s3.concat(s4));
        }
    }
}
