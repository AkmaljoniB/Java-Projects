package Codingbat.Functional_1;

import java.util.List;

public class Copies3 {
    public List<String> copies3(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            for (int j = 0; j < 2; j++) {
                strings.set(i, strings.get(i).concat(s));
            }
        }
        return strings;
    }
}
