package Alexeev;

import java.util.Scanner;

public class Alexeev_0924 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        String s4 = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < 3; i++) {
            if (s1.substring(i, i + 1).equals(s2.substring(i, i + 1)) && s1.substring(i, i + 1).equals(s2.substring(i + 1, i + 2)) && s1.substring(i + 1, i + 2).equals(s2.substring(i, i + 1))) {
                System.out.println("No");
                a++;
                break;
            } else if (s3.substring(i, i + 1).equals(s2.substring(i, i + 1)) && s3.substring(i, i + 1).equals(s2.substring(i + 1, i + 2)) && s3.substring(i + 1, i + 2).equals(s2.substring(i, i + 1))) {
                System.out.println("No");
                a++;
                break;
            } else if (s3.substring(i, i + 1).equals(s4.substring(i, i + 1)) && s3.substring(i, i + 1).equals(s4.substring(i + 1, i + 2)) && s3.substring(i + 1, i + 2).equals(s4.substring(i, i + 1))) {
                System.out.println("No");
                a++;
                break;
            }
        }
        if (a==0){
            System.out.println("Yes");
        }
    }
}
