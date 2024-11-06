package Codeforces;

import java.util.Scanner;

public class Non_line_subsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =scanner.nextInt();
        while (t-->0){
            int n =scanner.nextInt();
            int q =scanner.nextInt();
            String s = scanner.next();
            for (int i = 0 ; i <q;i++){
                int l =scanner.nextInt();
                int r =scanner.nextInt();
                String z=s.substring(l-1,r);
                String x = s.substring(0,l-1);
                String d = s.substring(r);
                if (x.contains(z.substring(0,1))||d.contains(z.substring(z.length()-1))) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
