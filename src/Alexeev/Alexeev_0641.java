package Alexeev;

import java.util.*;
public class Alexeev_0641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String>list=new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String f = s.substring(0, i) + s.substring(i + 1, j) + s.substring(j + 1);
                list.add(f);
            }
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}
