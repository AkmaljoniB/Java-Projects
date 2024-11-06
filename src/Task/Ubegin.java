package Task;

import java.util.Scanner;

public class Ubegin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int n = scanner.nextInt();
        int summa = 0;
        for (int i=0; i<=n; i++) {
            summa += i;
        }
        System.out.println(summa);
    }

}
