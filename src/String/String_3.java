package String;

import java.util.Scanner;

public class String_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "Informatika";
        char[] charArray = s.toCharArray();
        for (char element: charArray){
            if (element == 'm'){
                System.out.println("Mega");
            }
            if (element == 'a'){
                System.out.println("anor");
            }
            if (element == 't'){
                System.out.println("telic");
            }
            if (element == 'k'){
                System.out.println("kartoshka");
            }
            if (element == 'i'){
                System.out.println("iris");
            }
        }
    }
}
