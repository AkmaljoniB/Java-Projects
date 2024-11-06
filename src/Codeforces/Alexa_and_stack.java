package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Alexa_and_stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pr= new PrintWriter(System.out);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            for (int i = 1; i <= n*2; i+=2) {
                pr.print(i + " ");
            }
            pr.println();
        }
        pr.close();
    }
}
