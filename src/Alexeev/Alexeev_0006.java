package Alexeev;

import java.util.Scanner;

public class Alexeev_0006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String a = "ABCDEFGH";
        String n="12345678";
        if (s.length()!=5 || !a.contains(s.substring(0, 1)) || !s.contains("-") || !a.contains(s.substring(3, 4))||!n.contains(s.substring(1,2))||!n.contains(s.substring(4,5))) {
            System.out.println("ERROR");
        } else {
            int q = Math.abs(a.indexOf(s.substring(0, 1)) - a.indexOf(s.substring(3, 4)));
            int w = Math.abs(Integer.parseInt(s.substring(1, 2)) - Integer.parseInt(s.substring(4, 5)));
            if ((q == 2 && w == 1) || (q == 1 && w == 2)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}