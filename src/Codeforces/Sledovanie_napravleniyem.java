package Codeforces;

import java.util.Scanner;

public class Sledovanie_napravleniyem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n =scanner.nextLine();
        for (int i = 0  ; i  < Integer.parseInt(n); i++){
            String k =scanner.nextLine();
            String s =scanner.nextLine();
            int x=0,y=0,a=0;
            for (int j = 0 ;j<s.length();j++){
                if (s.substring(j,j+1).equals("U")){
                    y++;
                }
                if (s.substring(j,j+1).equals("D")){
                    y--;
                }
                if (s.substring(j,j+1).equals("L")){
                    x--;
                }
                if (s.substring(j,j+1).equals("R")){
                    x++;
                }
                if (x==1 && y==1){
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
