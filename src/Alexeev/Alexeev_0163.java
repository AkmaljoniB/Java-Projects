package Alexeev;

import java.util.Scanner;

public class Alexeev_0163 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.substring(0,1).equals("x") && s.substring(1,2).equals("+")){
            System.out.println(Integer.parseInt(s.substring(4,5))-Integer.parseInt(s.substring(2,3)));
        }
        if (s.substring(0,1).equals("x") && s.substring(1,2).equals("-")){
            System.out.println(Integer.parseInt(s.substring(4,5))+Integer.parseInt(s.substring(2,3)));
        }
        if (s.substring(2,3).equals("x") && s.substring(1,2).equals("+")){
            System.out.println(Integer.parseInt(s.substring(4,5))-Integer.parseInt(s.substring(0,1)));
        }
        if (s.substring(2,3).equals("x") && s.substring(1,2).equals("-")){
            System.out.println(Integer.parseInt(s.substring(0,1))-Integer.parseInt(s.substring(4,5)));
        }
        if (s.substring(4,5).equals("x") && s.substring(1,2).equals("+")){
            System.out.println(Integer.parseInt(s.substring(0,1))+Integer.parseInt(s.substring(2,3)));
        }
        if (s.substring(4,5).equals("x") && s.substring(1,2).equals("-")){
            System.out.println(Integer.parseInt(s.substring(0,1))-Integer.parseInt(s.substring(2,3)));
        }
    }
}