package Codeforces;

import java.util.Scanner;

public class Veselaya_shutka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ghost = scanner.nextLine();
        String boss = scanner.nextLine();
        String s = scanner.nextLine();
        int k=0;
        for (int j = 0; j < ghost.length(); j++) {
            for (int i = 0; i < s.length(); i++) {
                if (ghost.substring(j, j + 1).equals(s.substring(i,i+1))){
                    k++;
                    s=s.substring(0,i).concat(s.substring(i+1));
                    break;
                }
            }
        }
        for (int j = 0; j < boss.length(); j++) {
            for (int i = 0; i < s.length(); i++) {
                if (boss.substring(j, j + 1).equals(s.substring(i,i+1))){
                    k++;
                    s=s.substring(0,i).concat(s.substring(i+1));
                    break;
                }
            }
        }
        if (k==ghost.length()+boss.length() && s.length()==0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}