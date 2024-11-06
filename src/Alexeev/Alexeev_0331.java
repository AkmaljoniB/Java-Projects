package Alexeev;

import java.util.Scanner;

public class Alexeev_0331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String p = scanner.nextLine();
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));
        h += Integer.parseInt(p.substring(0, p.indexOf(" ")));
        m += Integer.parseInt(p.substring(p.indexOf(" ") + 1));
        if (m >= 60) {
            h++;
            m -= 60;
        }
        while (h >= 24) h -= 24;
        if (h < 10) System.out.print("0" + h + ":");
        else System.out.print(h + ":");
        if (m < 10) System.out.print("0" + m);
        else System.out.print(m);
    }
}