package Codeforces;

import java.util.Scanner;

public class Vlad_and_the_best_of_five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int o = s.length()-s.replace("A", "").length();
            System.out.println(o>(s.length()-o)?"A":"B");
        }
    }
}
