package Alexeev;

import java.util.Scanner;

public class Alexeev_0095 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  s =scanner.next();
        int k =0;
        while (s.length()!=1){
            k++;
            int l = 0;
            for (int i = 0; i < s.length(); i++) {
                l+=Integer.parseInt(s.substring(i,i+1));
            }
            s = String.valueOf(l);
        }
        System.out.println(s +" "+k);
    }
}
