package Alexeev;

import java.util.Scanner;

public class Alexeev_0063 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int z = scanner.nextInt();
        for (int i = s; i >= 0; i--) {
            if (s-i==z/i && (s-i)*i==z){
                System.out.println(s-i);
                System.out.println(i);
                break;
            }
        }
    }
}
