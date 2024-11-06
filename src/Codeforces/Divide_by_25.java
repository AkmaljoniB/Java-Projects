package Codeforces;

import java.util.Scanner;

public class Divide_by_25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int a = s.lastIndexOf("0");
            int b = s.lastIndexOf("5");
            int e = -1, c = -1, d = -1;
            if (b != -1) {
                d = s.substring(0, b).lastIndexOf("7");
                c = s.substring(0, b).lastIndexOf("2");
            }
            if (a != -1) e = s.substring(0, a).lastIndexOf("0");
            int min =s.length();
            if (a!=-1)min =s.length()-s.substring(0,a).lastIndexOf("5")-2;
            min =Math.min(min,s.length()-Math.max(d,c)-2);
            min =Math.min(s.length()-e-2,min);
            System.out.println(min);
        }
    }
}