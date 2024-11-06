package Codeforces;


import java.util.Scanner;

public class Jumping_frog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-- > 0) {
            String[]arr = scanner.next().split("R");
            int max=0;
            for (String s : arr) max = Math.max(max, s.length());
            System.out.println(max+1);
        }
    }
}
