package Integer;

import java.util.Scanner;

public class Integer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a ;
        System.out.println("A = ");
        a = scanner.nextInt();
        System.out.println("сумма: "+ ((a/10)+(a%10)));
        System.out.println("ҳосили зарб: "+ ((a/10)*(a%10)));
    }
}