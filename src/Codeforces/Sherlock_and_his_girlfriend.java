package Codeforces;

import java.util.Scanner;

public class Sherlock_and_his_girlfriend {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n==1) {
            System.out.println(1);
            System.out.println(1);
        } else if (n==2){
            System.out.println(1);
            System.out.println("1 1");
        }else {
            System.out.println(2);
            for (int i = 2; i <= n + 1; i++) {
                if (IsSimple(i)) System.out.print("2 ");
                else System.out.print("1 ");
            }
        }
    }
    static boolean IsSimple(int ANum) {
        if (ANum < 2)
            return false;
        double s = Math.sqrt(ANum);
        for (int i = 2; i <= s; i++) {
            if (ANum % i == 0)
                return false;
        }
        return true;
    }
}
