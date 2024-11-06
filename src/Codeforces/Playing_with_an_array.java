package Codeforces;

import java.io.PrintWriter;
import java.util.Scanner;

public class Playing_with_an_array {
    public static void main(String[] args) {
        PrintWriter pr = new PrintWriter(System.out);
        Scanner scanner =new Scanner(System.in);
        int n =scanner.nextInt();
        int s =scanner.nextInt();
        if (n<=s/2){
            pr.println("YES");
            for (int i = 1; i < n; i++) pr.print("1 ");
            pr.println(s-n+1);
            pr.println(s-n);
        }else pr.println("NO");
        pr.close();
    }
}
