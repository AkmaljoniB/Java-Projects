package Alexeev;

import java.math.BigInteger;
import java.util.Scanner;

public class Alexeev_0275 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int s = Integer.parseInt(n);
        String[] arr = new String[s];
        for (int i = 0; i < s; i++) {
            BigInteger a=BigInteger.valueOf(0);
            arr[i] = scanner.nextLine();
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].substring(j, j + 1).equals("1")) {
                    BigInteger f = BigInteger.valueOf(2);
                    int h =arr[i].length()-j-1;
                    BigInteger d = f.pow(h);
                    a = a.add(d);
                }
            }
            if (a.mod(BigInteger.valueOf(7)).equals(BigInteger.valueOf(0))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            a = BigInteger.valueOf(0);
        }
    }
}