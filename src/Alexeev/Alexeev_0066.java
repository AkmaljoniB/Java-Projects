package Alexeev;

import java.util.Scanner;

public class Alexeev_0066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = "qwertyuiopasdfghjklzxcvbnm";
        char[] arr = s1.toCharArray();
        for (int i = 0; i < s1.length()-1; i++) {
            for (int d = 0; d < s.length(); d++) {
                if (s.charAt(d) == arr[i]) {
                    System.out.println(arr[i + 1]);
                }
            }
        }
        if (s.equals("m")) {
            System.out.println("q");
        }
    }
}