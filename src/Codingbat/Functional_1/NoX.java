package Codingbat.Functional_1;

import java.util.List;

public class NoX {
    public List<String> noX(List<String> strings) {
        for (int i =0;i<strings.size();i++){
            strings.set(i,strings.get(i).replace("x",""));
        }
        return strings;
    }
}
