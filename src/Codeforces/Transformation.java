package Codeforces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a =scanner.nextLine();
        String b =scanner.nextLine();
        if (a.length()!=b.length()) System.out.println("NO");
        else {
            String s ="YES";
            List<String>list = new ArrayList<>();
            list.add("a");
            list.add("e");
            list.add("i");
            list.add("o");
            list.add("u");
            for (int i = 0; i <a.length(); i++) {
                if ((!list.contains(a.substring(i,i+1)) && list.contains(b.substring(i,i+1)))||(list.contains(a.substring(i,i+1)) && !list.contains(b.substring(i,i+1)))){
                    s="NO";
                    break;
                }
            }
            System.out.println(s);
        }
    }
}
