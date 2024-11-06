package Alexeev;

import java.util.Arrays;
import java.util.Scanner;

public class Alexeev_0457 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = 0;
        while (true) {
            k++;
            if (s.length() < 4) for (int i = 0; i < 4 - s.length(); i++) s = s.concat("0");
            String[] arr = s.split("");
            Arrays.sort(arr);
            String p = arr[0] + arr[1] + arr[2] + arr[3];
            String d = arr[3] + arr[2] + arr[1] + arr[0];
            String f = String.valueOf(Integer.parseInt(d) - Integer.parseInt(p));
            if (s.equals(f)) break;
            s = f;
        }
        System.out.println(s);
        System.out.println(k - 1);
    }
}
