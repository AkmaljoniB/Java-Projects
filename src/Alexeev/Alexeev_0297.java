package Alexeev;

import java.util.Scanner;

public class Alexeev_0297 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int h =0;
        for (int i =0; i<s.length();i++){
            if (s.substring(i,i+1).equals("8")){
                h=h+2;
            } else if (s.substring(i,i+1).equals("9")||s.substring(i,i+1).equals("6")||s.substring(i,i+1).equals("0")){
                h++;
            }
        }
        System.out.println(h);
    }
}
