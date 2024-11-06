package Codeforces;

import java.util.Scanner;

public class Uniy_Fizik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int x, y, z,kx=0,ky=0,kz=0;
        for (int i = 0; i < a; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = scanner.nextInt();
            kx+=x;
            ky+=y;
            kz+=z;
        }
        if (kx == 0 && ky==0 && kz==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}