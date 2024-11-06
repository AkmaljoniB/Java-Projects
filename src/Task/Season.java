package Task;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a ==1){
            System.out.println("Зимистон, Январ");
        }
        if (a == 2){
            System.out.println("Тобистон, Феврал");
        }
        if (a == 3){
            System.out.println("Тирамоҳ, Март");
        }
        if (a == 4){
            System.out.println("Баҳор, Апрел");
        }
        if (a>4){
            System.out.println("Хато");
        }
    }
}
