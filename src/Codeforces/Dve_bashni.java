package Codeforces;

import java.util.Scanner;

public class Dve_bashni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.nextLine();
        for (int j = 0; j < Integer.parseInt(t); j++) {
            int k = 0, l = 0;
            String s = scanner.nextLine();
            String a1 = scanner.nextLine();
            String a2 = scanner.nextLine();
            for (int i = 0; i < a1.length()-1; i++) {
                if (a1.substring(i, i + 2).equals("BB") || a1.substring(i, i + 2).equals("RR")) {
                    l++;
                    l += i;
                    break;
                }
            }
            for (int i = 0; i < a2.length()-1; i++) {
                if (a2.substring(i, i + 2).equals("BB") || a2.substring(i, i + 2).equals("RR")) {
                    k++;
                    k += i;
                    break;
                }
            }
            if (l != 0 || k != 0) {
                if (k == 0) {
                    int q=0;
                    int p = a1.length();
                    for (int i = l; i < p; i++) {
                        if (!a2.substring(a2.length()-1).equals(a1.substring(a1.length()-1))){
                            a2 = a2.concat(a1.substring(a1.length()-1));
                            a1 = a1.substring(0,a1.length()-1);
                        } else {
                            System.out.println("NO");
                            q++;
                            break;
                        }
                    }
                    if(q==0){
                        System.out.println("YES");
                    }
                } else {
                    int q=0;
                    int p = a2.length();
                    for (int i = k; i <p; i++) {
                        if (!a2.substring(a2.length()-1).equals(a1.substring(a1.length()-1))){
                            a1 = a1.concat(a2.substring(a2.length()-1));
                            a2 = a2.substring(0,a2.length()-1);
                        } else {
                            System.out.println("NO");
                            q++;
                            break;
                        }
                    }
                    if (q==0){
                        System.out.println("YES");
                    }
                }
            } else {
                System.out.println("YES");
            }
        }
    }
}
