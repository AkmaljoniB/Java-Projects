package Codeforces;

import java.util.Scanner;

public class Superagent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        StringBuffer a3 = new StringBuffer(s3);
        a3.reverse();
        if ((s1.contentEquals(a3) && s2.equals("..."))||(s1.contentEquals(a3) && s2.equals(".X."))||(s1.contentEquals(a3) && s2.equals("X.X"))||(s1.contentEquals(a3) && s2.equals("XXX"))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}