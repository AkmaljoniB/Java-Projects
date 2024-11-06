package Alexeev;

import java.util.Scanner;

public class Alexeev_0693 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next().toLowerCase();
        String b = scanner.next().toLowerCase();
        String s ="Yes";
        for (int i = 0; i <a.length() ; i++) {
            if (!b.contains(a.substring(i,i+1))){
                s="No";
                break;
            }
            b=b.substring(0,b.indexOf(a.substring(i,i+1))).concat(b.substring(b.indexOf(a.substring(i,i+1))+1));
        }
        if (b.length()!=0)s="No";
        System.out.println(s);
    }
}
