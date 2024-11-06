package Codeforces;

import java.util.Scanner;

public class Three_lines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            String a = scanner.next();
            String b = scanner.next();
            String c = scanner.next();
            String s ="YES";
            for (int i = 0 ; i <a.length();i++){
                if (!c.substring(i,i+1).equals(a.substring(i,i+1))&&!c.substring(i,i+1).equals(b.substring(i,i+1))) {
                    s = "NO";
                    break;
                }
            }
            System.out.println(s);

        }
    }
}
