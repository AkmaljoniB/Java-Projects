package Alexeev;

import java.util.Scanner;

public class Alexeev_0839 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int a = 0;
        for (int i =0; i< s.length();i++){
            if (s.substring(i,i+1).equals("0")){
                System.out.println("NO");
                a++;
                break;
            }
        }
        if (a==0){
            System.out.println("YES");
        }
    }
}
