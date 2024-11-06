package Alexeev;

import java.util.Scanner;

public class Alexeev_0775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n =scanner.next();
        String m =scanner.next();
        if (m.equals("0")) System.out.println("NO");
        else {
            n=n.substring(0,n.length()-1)+(Integer.parseInt(n.substring(n.length()-1))+1);
            System.out.println(n);
        }
    }
}
