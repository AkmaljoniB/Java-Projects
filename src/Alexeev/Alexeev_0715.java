package Alexeev;

import java.util.Scanner;

public class Alexeev_0715 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nm = scanner.nextLine();
        int n=0, m=0;
        for (int i = 0; i < nm.length(); i++) {
            if (nm.substring(i,i+1).equals(" ")) {
                n = Integer.parseInt(nm.substring(0,i));
                m = Integer.parseInt(nm.substring(i+1));
                break;
            }
        }
        String[] arr = new String[n];
        String[] arr1 = new String[n];
        int a = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }
        String d = scanner.nextLine();
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextLine();
            for (int j = 0; j < m; j++) {
                if ((arr[i].substring(j, j + 1)).equals(arr1[i].substring(j, j + 1))) {
                    a++;
                }
            }
        }
        System.out.println(a);
    }
}