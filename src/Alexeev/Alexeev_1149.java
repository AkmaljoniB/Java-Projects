package Alexeev;

import java.util.Scanner;

public class Alexeev_1149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a=0;
        for (int i =0; i< s.length();i++){
            if (s.substring(i,i+1).equals("0")){
                a++;
            }
        }
        System.out.println(a);
    }
}
