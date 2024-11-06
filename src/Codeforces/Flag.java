package Codeforces;

import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String b = "YES";
        String q = "a";
        for (int i = 0 ; i<n;i++){
            String s = scanner.next();
            if (s.contains(q)){
                b="NO";
                break;
            }
            q = s.substring(0,1);
            s = s.replace(s.substring(0,1),"");
            if (s.length()!=0){
                b="NO";
                break;
            }
        }
        System.out.println(b);
    }
}
