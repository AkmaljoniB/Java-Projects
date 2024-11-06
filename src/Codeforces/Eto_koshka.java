package Codeforces;

import java.util.Scanner;

public class Eto_koshka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int k = 0;
            for (int i = 0; i < n - 1; i++) {
                if (!s.substring(i, i + 1).equalsIgnoreCase(s.substring(i + 1, i + 2))) {
                    if (s.substring(i, i + 2).equalsIgnoreCase("me")||s.substring(i, i + 2).equalsIgnoreCase("eo")||s.substring(i, i + 2).equalsIgnoreCase("ow")){
                        k++;
                    } else {
                        k=-1;
                        System.out.println("NO");
                        break;
                    }
                }
            }
            if (k == 3) {
                System.out.println("YES");
            } else if (k!=-1){
                System.out.println("NO");
            }
            t--;
        }
    }
}
