package If;

import java.util.Scanner;

public class If11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a>b){
            System.out.println("a = "+a);
            System.out.println("b = "+a);
        } else  {
            System.out.println("a = "+b);
            System.out.println("b = "+b);
        }
    }
}
