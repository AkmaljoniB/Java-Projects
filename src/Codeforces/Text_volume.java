package Codeforces;

import java.util.Scanner;

public class Text_volume {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        sc.nextLine();
        String[]ars=sc.nextLine().split(" ");
        for (String ar : ars) {
            int k = 0;
            for (int j = 0; j < ar.length(); j++) if (!ar.substring(j, j + 1).toLowerCase().equals(ar.substring(j, j + 1))) k++;
            max = Math.max(max, k);
        }
        System.out.println(max);
    }
}