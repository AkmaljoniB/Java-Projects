package Integer;

import java.util.Scanner;

public class Integer11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        System.out.println("A = ");
        A = scanner.nextInt();
        System.out.println("Cумма: " + ((A/100)+(A/10%10)+(A%10)));
        System.out.println("Ҳосили зарб: " + ((A/100)*(A/10%10)*(A%10)));
    }
}
