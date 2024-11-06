package Codeforces;

import java.util.Scanner;

public class Game_chat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt(),k=0;
            String s=sc.next();
            for (int i=n-1;i>=0;i--){
                if (s.charAt(i)==')')k++;
                else break;
            }
            System.out.println(k>n-k?"Yes":"No");
        }
    }
}