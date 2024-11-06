package Codeforces;

import java.util.Scanner;

public class Ne_otvlekaysya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        for (int j = 0; j < Integer.parseInt(t); j++) {
            String n = scanner.nextLine();
            String s = scanner.nextLine();
            int p =0;
            for (int i = 0; i < s.length(); i++) {
                for (int k = 0;k<s.length();k++){
                    if (!s.substring(i,i+1).equals(s.substring(k,k+1))){
                        int l = s.length()-(k-i);
                        s = s.replace(s.substring(i,i+1),"");
                        if (s.length()!=l){
                            System.out.println("NO");
                            p++;
                            break;
                        } else {
                            i--;
                            break;
                        }
                    }
                }
                if (p==1){
                    break;
                }
            }
            if (p==0){
                System.out.println("YES");
            }
        }
    }
}