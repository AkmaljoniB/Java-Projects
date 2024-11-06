package Alexeev;

import java.util.Scanner;

public class Alexeev_0895 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        String s3 = scanner.nextLine();
        if ((s1.substring(0, 1).equals("X") && s2.substring(1,2).equals("X") && s3.substring(2,3).equals("X") )|| (s1.substring(2, 3).equals("X") && s2.substring(1,2).equals("X") && s3.substring(0,1).equals("X"))) {
            System.out.println("Win");
        } else if (s1.substring(0,3).equals("XXX")||s2.substring(0,3).equals("XXX") || s3.substring(0,3).equals("XXX")){
            System.out.println("Win");
        } else if ((s1.substring(0,1).equals("X") && s2.substring(0,1).equals("X") && s3.substring(0,1).equals("X")) || (s1.substring(1,2).equals("X") && s2.substring(1,2).equals("X") && s3.substring(1,2).equals("X")) || (s1.substring(2,3).equals("X") && s2.substring(2,3).equals("X") && s3.substring(2,3).equals("X"))) {
            System.out.println("Win");
        } else if ((s1.substring(0, 1).equals("O") && s2.substring(1,2).equals("O") && s3.substring(2,3).equals("O") )|| (s1.substring(2, 3).equals("O") && s2.substring(1,2).equals("O") && s3.substring(0,1).equals("O"))) {
            System.out.println("Lose");
        } else if (s1.substring(0,3).equals("OOO")||s2.substring(0,3).equals("OOO") || s3.substring(0,3).equals("OOO")){
            System.out.println("Lose");
        } else if ((s1.substring(0,1).equals("O") && s2.substring(0,1).equals("O") && s3.substring(0,1).equals("O")) || (s1.substring(1,2).equals("O") && s2.substring(1,2).equals("O") && s3.substring(1,2).equals("O")) || (s1.substring(2,3).equals("O") && s2.substring(2,3).equals("O") && s3.substring(2,3).equals("O"))) {
            System.out.println("Lose");
        } else {
            System.out.println("Draw");
        }
    }
}