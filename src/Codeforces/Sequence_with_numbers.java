package Codeforces;

import java.util.Scanner;

public class Sequence_with_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            long a =scanner.nextLong();
            long k =scanner.nextLong();
            while (k-->1){
                String s = String.valueOf(a);
                int max=0,min=9;
                if (s.contains("0"))break;
                for (int i =9;i>=0;i--) {
                    if (s.contains(String.valueOf(i))) {
                        max = i;
                        break;
                    }
                }
                for (int i =0;i<=9;i++) {
                    if (s.contains(String.valueOf(i))) {
                        min = i;
                        break;
                    }
                }
                a = a+ (long) max *min;
            }
            System.out.println(a);
        }
    }
}