package Codeforces;

import java.util.Scanner;

public class Anton_i_Danik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        String str = scanner.nextLine();
        int a = 0, d=0;
        for (int i =0;i<Integer.parseInt(n);i++){
            if (str.substring(i,i+1).equals("A")){
                a++;
            }
            if (str.substring(i,i+1).equals("D")){
                d++;
            }
        }
        if (a>d){
            System.out.println("Anton");
        } else if (a<d){
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}