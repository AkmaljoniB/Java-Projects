package Alexeev;

import java.util.Scanner;

public class Alexeev_0482 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        String s = "";
        int k = 1;
        while (s.length()<n){
            for (int i = 1; i <= k; i++) s = s+i;
            k++;
        }
        System.out.println(s.charAt(n-1));
    }
}
