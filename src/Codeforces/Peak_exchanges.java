package Codeforces;

import java.util.Scanner;

public class Peak_exchanges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            String b ="NO";
            for (int i = 0; i < n; i++) {
                int a =scanner.nextInt();
                if (a==1 && i==0)b="YES";
            }
            System.out.println(b);
        }
    }
}
