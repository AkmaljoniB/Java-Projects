package String;

import java.util.Scanner;

public class String_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s2 = "Ma" ;
        String s3 = "te" ;
        String s1 = "Matematica" ;
        switch (s.length()) {
            case 5:
                System.out.println(s1.substring(4));
                break;
            case 4:
                System.out.println(s2.concat(s3));
                break;
            case 3:
                System.out.println(s1.substring(2, 5));
                break;
            case 2:
                System.out.println(s1.substring(6, 9));
                break;
            case 1:
                System.out.println(s1.charAt(0));
                break;
            default:
                System.out.println("Adadro az 5 khurd dokhil kuned");
        }
    }
}