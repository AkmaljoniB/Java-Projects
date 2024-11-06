package Codingbat.Functional_2;

import java.util.ArrayList;
import java.util.List;

public class NoYY {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("yyx");
        list.add("y");
        list.add("zzz");
        System.out.println(noYY(list));
    }
    public static List<String> noYY(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            strings.set(i, strings.get(i).concat("y"));
            for (int j = 0; j < strings.get(i).length()-1; j++) {
                if (strings.get(i).substring(j,j+2).equals("yy")) {
                    strings.remove(i);
                    i--;
                    break;
                }
            }
        }
        return strings;
    }
}
