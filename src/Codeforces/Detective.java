package Codeforces;

import java.util.Scanner;

public class Detective {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        for (int i=s.length()-1;i>=0;i--) {
            if (Character.isLetter(s.charAt(i))){
                if (s.charAt(i)=='a'||s.charAt(i)=='i'||s.charAt(i)=='u'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='y')s="YES";
                else s="NO";
                break;
            }
        }
        System.out.println(s);
    }
}