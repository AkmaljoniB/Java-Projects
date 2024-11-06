package Codeforces;

import java.util.Scanner;

public class Dice_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b =scanner.nextInt();
        int a1=0,a2=0,a3=0;
        for (int i = 1; i <=6; i++) {
            if (Math.abs(a-i)<Math.abs(b-i))a1++;
            else if (Math.abs(a-i)>Math.abs(b-i))a2++;
            else a3++;
        }
        System.out.println(a1+" "+a3+" "+a2);
    }
}
