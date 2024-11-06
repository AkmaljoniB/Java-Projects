package Codeforces;

import java.util.Scanner;

public class Word_on_paper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = "";
            for (int i = 0; i < 8; i++) {
                s = s.concat(scanner.next());
            }
            s = s.replace(".", "");
            System.out.println(s);
        }
    }
}
