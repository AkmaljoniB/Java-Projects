package Codingbat.Functional_2;

import java.util.List;

public class NoLong {
    public List<String> noLong(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() > 3) {
                strings.remove(i);
                i--;
            }
        }
        return strings;
    }
}
