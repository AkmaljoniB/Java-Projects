package Codingbat.Functional_2;

import java.util.List;

public class No34 {
    public List<String> no34(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == 3 || strings.get(i).length() == 4 ) {
                strings.remove(i);
                i--;
            }
        }
        return strings;
    }
}
