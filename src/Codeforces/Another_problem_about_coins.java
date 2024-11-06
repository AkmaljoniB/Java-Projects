package Codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Another_problem_about_coins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 15 == 0) System.out.println(n / 15);
            else {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(1, 1);
                map.put(2, 2);
                map.put(3, 1);
                map.put(4, 2);
                map.put(5, 3);
                map.put(6, 1);
                map.put(7, 2);
                map.put(8, 3);
                map.put(9, 2);
                map.put(10, 1);
                map.put(11, 2);
                map.put(12, 2);
                map.put(13, 2);
                map.put(14, 3);
                map.put(15, 1);
                map.put(16, 2);
                map.put(17, 3);
                map.put(18, 2);
                map.put(19, 3);
                map.put(20, 2);
                int k = n / 15;
                n = n % 15;
                if (k != 0) {
                    n += 15;
                    System.out.println(k + Math.min(map.get(n - 10), map.get(n - 15)));
                } else System.out.println(map.get(n));
            }
        }
    }
}
//1 3 6 10 15
//1 - 1
//2 - 2
//3 - 1
//4 - 2
//5 - 3
//7 - 2
//8 - 3
//9 - 2
//10 -1
//11 -2
//12 -2
//13 -2
//14 -3
//15 -1
//16 -2
//17 -3
//18 -2
//19 -3
//20 -2
//21 -2
//22 -3
//23 -3
//24 -3
//25 -2
//26 -3
//27 -3
//28 -3
//29 -4
//30 -2