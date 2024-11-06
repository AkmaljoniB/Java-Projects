package Codeforces;

import java.util.Scanner;

public class Obratniy_otschet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        for (int i = 0; i < Integer.parseInt(t); i++) {
            String n = scanner.nextLine();
            String s = scanner.nextLine();
            int sum = 0;
            for (int j = 0; j < s.length(); j++) {
                sum += Integer.parseInt(s.substring(j,j+1));
                if (!s.substring(j,j+1).equals("0") && j!=s.length()-1){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
