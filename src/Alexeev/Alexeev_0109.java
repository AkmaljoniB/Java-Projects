package Alexeev;

import java.util.Scanner;

public class Alexeev_0109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = Integer.parseInt(s.substring(0, s.indexOf("/")));
        int b = Integer.parseInt(s.substring(s.indexOf("/") + 1));
        System.out.print(a / b);
        if (a % b != 0) {
            String sb = String.valueOf((double) a / (double) b);
            System.out.print(".");
            sb = sb.substring(sb.indexOf(".") + 1);
            System.out.println(sb);
            if (sb.replace(sb.substring(0,1),"").length()==0) System.out.println("("+sb.charAt(0)+")");
            else {

                for (int i = 0; i < sb.length(); i++) {

                }
            }
        }
    }
}