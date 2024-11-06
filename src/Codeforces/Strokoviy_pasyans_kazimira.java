package Codeforces;

import java.util.Scanner;

public class Strokoviy_pasyans_kazimira {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        for (int i = 0 ; i <n;i++){
            String s =scanner.next();
            int l =s.length();
            s=s.replace("B","");
            if (l-s.length()==s.length()){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}