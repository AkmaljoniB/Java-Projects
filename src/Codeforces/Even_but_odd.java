package Codeforces;

import java.util.Scanner;

public class Even_but_odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int k = 0;
            String b="";
            for (int i = 0; i < n; i++) {
                int a =Integer.parseInt(s.substring(i,i+1));
                if (a%2!=0){
                    k++;
                    b = b.concat(s.substring(i,i+1));
                    if (k==2)break;
                }
            }
            System.out.println(k!=2?-1:b);
        }
    }
}
