package Codeforces;

import java.util.Scanner;

public class Sharing_and_deleting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            String s = scanner.next();
            int k0=s.replace("1","").length();
            int k1=s.length()-k0;
            int i=0;
            for (; i < s.length(); i++) {
                if (s.charAt(i) == '1')k0--;
                else k1--;
                if (k1<0||k0<0){
                    break;
                }
            }
            System.out.println(s.length()-i);
        }
    }
}
