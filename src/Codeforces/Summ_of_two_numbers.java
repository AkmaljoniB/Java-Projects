package Codeforces;

import java.util.Scanner;

public class Summ_of_two_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n % 2 == 0) System.out.println((n / 2) + " " + (n / 2));
            else {
                String s = String.valueOf(n);
                boolean b = false;
                for (int i = s.length() - 1; i >= 0; i--) {
                    if (!s.substring(i, i + 1).contains("9")) {
                        if (Integer.parseInt(s.substring(i, i + 1)) % 2 == 0) b = true;
                        break;
                    }
                }
                if (!b && n % 10 == 9) {
                    if (s.length() > 1 && !s.substring(0, 2).contains("9"))
                        System.out.println((n / 2 - 4) + " " + (n / 2 + 5));
                    else {
                        String x = String.valueOf((n / 2));
                        String y = String.valueOf((n / 2 + 1));
                        int sumx = 10;
                        int sumy = 0;
                        while (Math.abs(sumx - sumy) != 0 && Math.abs(sumx - sumy) != 1) {
                            sumx = 0;
                            sumy = 0;
                            for (int i = 0; i < x.length(); i++) sumx += Integer.parseInt(x.substring(i, i + 1));
                            for (int i = 0; i < y.length(); i++) sumy += Integer.parseInt(y.substring(i, i + 1));
                            x = String.valueOf(Integer.parseInt(x) - 1);
                            y = String.valueOf(Integer.parseInt(y) + 1);
                        }
                        System.out.println((Integer.parseInt(x) + 1) + " " + (Integer.parseInt(y) - 1));
//                        System.out.println(((n/2)-49)+" "+(n/2+50));
                    }
                } else System.out.println((n / 2) + " " + (n / 2 + n % 2));
            }
        }
    }
}
