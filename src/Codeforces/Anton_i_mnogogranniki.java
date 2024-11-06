package Codeforces;

import java.util.Scanner;

public class Anton_i_mnogogranniki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < Integer.parseInt(n); i++) {
            String s = scanner.nextLine();
            if (s.equals("Tetrahedron")) {
                a += 4;
            } else if (s.equals("Cube")) {
                a += 6;
            } else if (s.equals("Octahedron")) {
                a += 8;
            } else if (s.equals("Dodecahedron")) {
                a += 12;
            } else if (s.equals("Icosahedron")) {
                a += 20;
            }
        }
        System.out.println(a);
    }
}