package Codeforces;

import java.util.Scanner;

public class Minimalniy_kvadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int min = Math.min(a,b);
            int max = Math.max(a,b);
            if (min*2>=max){
                System.out.println(min*min*4);
            } else {
                System.out.println(max*max);
            }
        }
    }
}