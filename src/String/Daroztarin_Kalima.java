package String;

import java.util.Scanner;

public class Daroztarin_Kalima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калимаро дохил кунед! ");
        String str = scanner.nextLine();
        String maxword = "";
        str = str + ' ' ;
        String word = "";
        int maxlength = 0;

        for (int i = 0; i < str.length(); i++) {
            word = word + str.charAt(i);
            if (str.charAt(i + 1) == ' ') {
                if (word.length() > maxlength) {
                    maxword = new String(word);
                    maxlength = word.length();
                }
                word = "";
                i++;
            }
        }
        System.out.println("Калимаи дарозтарин: " + maxword);
    }
}