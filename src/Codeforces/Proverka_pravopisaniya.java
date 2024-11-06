package Codeforces;

import java.util.Scanner;

public class Proverka_pravopisaniya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int l =scanner.nextInt();
            String s = scanner.next();
            if (s.length()==5){
                s = s.replace("T","");
                if (s.length()!=4){
                    System.out.println("NO");
                } else {
                    s =s.replace("i","");
                    if (s.length()!=3){
                        System.out.println("NO");
                    } else {
                        s =s.replace("m","");
                        if (s.length()!=2){
                            System.out.println("NO");
                        } else {
                            s =s.replace("u","");
                            if (s.length()!=1){
                                System.out.println("NO");
                            } else {
                                s =s.replace("r","");
                                if (s.equals("")){
                                    System.out.println("YES");
                                } else {
                                    System.out.println("NO");
                                }
                            }
                        }
                    }
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}
