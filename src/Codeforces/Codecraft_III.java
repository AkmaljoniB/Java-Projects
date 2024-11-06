package Codeforces;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Codecraft_III {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int k = scanner.nextInt();
        List<String>list=new LinkedList<>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");
        int p =(list.indexOf(s)+k)%12;
        System.out.println(list.get(p));
    }
}
