package Integer;

import java.util.Scanner;

public class Integer6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A ;
        System.out.println("A = ");
        A = scanner.nextInt();
        System.out.println("Даҳи: "+ (A / 10));
        System.out.println("Воҳид: "+ (A % 10));
    }
}