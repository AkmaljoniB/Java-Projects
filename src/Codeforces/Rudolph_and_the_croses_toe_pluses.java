package Codeforces;

import java.util.Scanner;

public class Rudolph_and_the_croses_toe_pluses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s1 = scanner.next();
            String s2 = scanner.next();
            String s3 = scanner.next();
            String b = "DRAW";
            label:
            for (int i = 0; i < 8; i++) {
                String s = "";
                if (i < 3) s = s1.substring(i, i + 1) + s2.charAt(i) + s3.charAt(i);
                else if (i == 3) s = s1;
                else if (i == 4) s = s2;
                else if (i == 5) s = s3;
                else if (i == 6) s = s1.substring(0, 1) + s2.charAt(1) + s3.charAt(2);
                else s = s1.substring(2, 3) + s2.charAt(1) + s3.charAt(0);

                switch (s) {
                    case "XXX":
                        b = "X";
                        break label;
                    case "OOO":
                        b = "O";
                        break label;
                    case "+++":
                        b = "+";
                        break label;
                }
            }
            System.out.println(b);
        }
    }
}
