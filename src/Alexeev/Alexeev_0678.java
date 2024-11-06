package Alexeev;

import java.util.Scanner;

public class Alexeev_0678 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String s = scanner.nextLine();
        String b = "ABC";
        for (int i =0; i< s.length();i++){
            if (s.substring(i,i+1).equals("A")){
                b = b.substring(1,2).concat(b.substring(0,1)).concat(b.substring(2,3));
            } else if (s.substring(i,i+1).equals("B")){
                b = b.substring(0,1).concat(b.substring(2,3)).concat(b.substring(1,2));
            } else if (s.substring(i,i+1).equals("C")){
                b = b.substring(2,3).concat(b.substring(1,2).concat(b.substring(0,1)));
            }
        }
        if (b.substring(0,1).equals("A")){
            System.out.println(1);
        } else if (b.substring(1,2).equals("A")){
            System.out.println(2);
        } else {
            System.out.println(3);
        }
    }
}