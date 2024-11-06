package Game;

import java.util.Scanner;

public class Ugadayka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Загадай число!");
        String s = scanner.nextLine();
        int i = 50;
        int j = 50;
        while (i > 0) {
            System.out.println(i);
            System.out.println("Я угадал ?");
            System.out.println("Да или Нет?");
            s = scanner.nextLine();
            if (s.equalsIgnoreCase("Yes") || s.equals("Да")) {
                System.out.println("Я нашёл твоё число ты продул!");
                break;
            } else {
                System.out.println("Больше чем " + i + " или нет?");
                System.out.println("Напишите < или >");
                s = scanner.nextLine();
                if (s.equals(">")) {
                    i += j / 2;
                } else {
                    i -= j / 2;
                }
                j = Math.abs(50 - i);
            }
        }
    }
}