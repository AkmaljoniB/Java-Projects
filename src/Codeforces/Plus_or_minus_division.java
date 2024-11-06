package Codeforces;

import java.util.Scanner;

public class Plus_or_minus_division {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        for(int t =sc.nextInt();t-->0;){
            sc.nextInt();
            String s=sc.next();
            int k =s.replace("+","").length();
            System.out.println(Math.abs(s.length()-k-k));
        }
    }
}
