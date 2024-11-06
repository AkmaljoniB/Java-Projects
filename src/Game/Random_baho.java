package Game;

import java.util.Random;
import java.util.Scanner;

public class Random_baho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for (int i = 0;i>=0;i++) {
            String s =scanner.nextLine();
            int a = random.nextInt(4) + 2;
            System.out.print("Баҳои ту: ");
            System.out.println(a);
        }
    }
}
