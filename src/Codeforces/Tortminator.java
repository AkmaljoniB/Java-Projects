package Codeforces;

import java.util.Scanner;

public class Tortminator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String p = scanner.nextLine();
        int r = 0, c = 0;
        for (int i = 0; i < p.length(); i++) {
            if (p.substring(i, i + 1).equals(" ")) {
                r = Integer.parseInt(p.substring(0, i));
                c = Integer.parseInt(p.substring(i + 1));
                break;
            }
        }
        String arr[] = new String[r];
        String s = "..........";
        s = s.substring(0, c);
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
            if (arr[i].equals(s)) {
                k += s.length();
            }
        }
        int e=0;
        int w = k;
        for (int j = 0 ;j<c;j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].substring(j, j + 1).equals(".")) {
                    e++;
                } else {
                    break;
                }
            }
            if (e==r){
                k+=r-w/c;
            }
            e=0;
        }
        System.out.println(k);
    }
}