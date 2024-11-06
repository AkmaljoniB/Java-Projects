package Codeforces;

import java.util.Scanner;

public class Cherniy_kvadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
        String s = scanner.nextLine();
        String f="";
        int a1=0,a2=0,a3=0,a4=0;
        int l=0;
        for (int i = 0 ; i <str.length();i++) {
            if (!str.substring(i, i + 1).equals(" ")) {
                f = f.concat(str.substring(i,i+1));
            } else if (l==0){
                a1 = Integer.parseInt(f);
                f="";
                l++;
            } else if (l==1){
                a2 = Integer.parseInt(f);
                f="";
                l++;
            }  else if (l==2){
                a3 = Integer.parseInt(f);
                f="";
                l++;
            }  else if (l==3){
                a4 = Integer.parseInt(f);
                f="";
                break;
            }
        }
        a4=Integer.parseInt(f);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).equals("1")) {
                sum += a1;
            } else if (s.substring(i, i + 1).equals("2")) {
                sum += a2;
            } else if (s.substring(i, i + 1).equals("3")) {
                sum += a3;
            } else {
                sum += a4;
            }
        }
        System.out.println(sum);
    }
}