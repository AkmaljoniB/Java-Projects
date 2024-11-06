package Alexeev;

import java.util.Scanner;

public class Alexeev_0059 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n =scanner.nextInt();
        int k =scanner.nextInt();
        String s = Integer.toString(n,k);
        int s1=1,s2=0;
        for (int i = 0; i < s.length(); i++) {
            int a= Integer.parseInt(s.substring(i,i+1));
            s1*=a;
            s2+=a;
        }
        System.out.println(s1-s2);
    }
}
