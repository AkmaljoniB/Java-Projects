package Codeforces;

import java.util.Scanner;

public class Dabstep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.replace("WUB"," ");
        s = s.trim();
        for (int i =0;i<s.length()-1;i++){
            if (s.substring(i,i+2).equals("  ")){
                s = s.substring(0,i+1).concat(s.substring(i+2));
                break;
            }
        }
        System.out.println(s);
    }
}