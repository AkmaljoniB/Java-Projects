package Alexeev;

import java.util.Scanner;

public class Alexeev_0940 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a =0;
        for (int i =0; i<s.length();i++ ){
            if (s.substring(i,i+1).equals(" ")){
                a = Integer.parseInt(s.substring(0, i));
                break;
            }
        }
        for (int i = 1; i < s.length(); i++) {
            if (!s.substring(i, i + 1).equals(" ")) {
                if (a<10){
                    System.out.println(s.substring(i, a - 1+i).concat(s.substring(a+i)));
                } else{
                    System.out.println(s.substring(i+2,a+1+i).concat(s.substring(a+1+i+1)));
                }
                break;
            }
        }
    }
}