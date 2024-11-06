package Codeforces;

import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            String s =scanner.next();
            String b = "No";
            for (int i = 0 ;i<n-1;i++){
                if (s.substring(i+2).contains(s.substring(i,i+2))){
                    b="YES";
                    break;
                }
            }
            System.out.println(b);
        }
    }
}
