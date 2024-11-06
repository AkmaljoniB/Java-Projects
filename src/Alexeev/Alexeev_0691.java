package Alexeev;

import java.util.Scanner;

public class Alexeev_0691 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int x = Integer.parseInt(n);
        String alp = "ABCEHKMOPTXY";
        String number = "0123456789";
        int a = 0;
        for (int j = 0; j < x; j++) {
            String p = scanner.nextLine();
            if (p.length()==6) {
                for (int i = 0; i < alp.length(); i++) {
                    if (alp.substring(i, i + 1).equals(p.substring(0, 1))) {
                        a++;
                    }
                    if (alp.substring(i, i + 1).equals(p.substring(4, 5))) {
                        a++;
                    }
                    if (alp.substring(i, i + 1).equals(p.substring(5, 6))) {
                        a++;
                    }
                }
                for (int w = 0; w < number.length(); w++) {
                    if (p.substring(1, 2).equals(number.substring(w, w + 1))) {
                        a++;
                    }
                    if (p.substring(2, 3).equals(number.substring(w, w + 1))) {
                        a++;
                    }
                    if (p.substring(3, 4).equals(number.substring(w, w + 1))) {
                        a++;
                    }
                }
                if (a == 6) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
                a = 0;
            } else {
                System.out.println("No");
            }
        }
    }
}
