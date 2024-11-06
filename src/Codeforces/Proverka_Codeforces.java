package Codeforces;

import java.util.Scanner;

public class Proverka_Codeforces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String code = "Codeforces";
        for (int i = 0; i < Integer.parseInt(n); i++) {
            String s = scanner.nextLine();
            int a=0;
            for (int j = 0 ; j  < code.length();j++){
                if (s.equals(code.substring(j,j+1))){
                    System.out.println("YES");
                    a++;
                    break;
                }
            }
            if (a==0){
                System.out.println("NO");
            }
        }
    }
}