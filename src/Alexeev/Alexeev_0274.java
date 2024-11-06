package Alexeev;

import java.util.Scanner;

public class Alexeev_0274 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t= scanner.nextInt();
        while (t-->0){
            String a =scanner.next();
            String b =scanner.next();
            String s="YES";
            for (int i = 0; i < a.length(); i++) {
                if (!b.contains(a.substring(i,i+1))){
                    s="NO";
                    break;
                }
            }
            for (int i = 0; i < b.length(); i++) {
                if (!a.contains(b.substring(i,i+1))){
                    s="NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
