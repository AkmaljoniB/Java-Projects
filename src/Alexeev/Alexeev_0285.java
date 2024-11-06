package Alexeev;

import java.util.Scanner;

public class Alexeev_0285 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m =scanner.nextInt();
        int s =1,max=0;
        for (int i = 0; i < n; i++) {
            int a =scanner.nextInt();
            max=Math.max(max,a);
            s+=a-1;
        }
        if (max>m||s<m) System.out.println("no");
        else System.out.println("yes");
    }
}
