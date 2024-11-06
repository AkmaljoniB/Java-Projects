package Codeforces;

import java.util.Scanner;

public class Tri_parnikh_mushketyora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            int max = Math.max(x, Math.max(y, z));
            int min = Math.min(x, Math.min(y, z));
            if ((x == max && y == max) || (y == max && z == max) || (x == max && z == max)) {
                System.out.println("YES");
                System.out.print(1+" ");
                System.out.print(min+" ");
                System.out.println(max+" ");
            } else {
                System.out.println("NO");
            }
        }
    }
}