package String;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(s).reverse();
        System.out.println(sb);
        if (s.contentEquals(sb)){
            System.out.println("palindrom ast");
        } else {
            System.out.println("palindrom nest");
        }
    }
}