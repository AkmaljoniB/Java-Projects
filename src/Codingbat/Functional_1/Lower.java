package Codingbat.Functional_1;

import java.util.List;

public class Lower {
    public List<String> lower(List<String> strings) {
        for (int i = 0 ; i<strings.size();i++){
            strings.set(i,strings.get(i).toLowerCase());
        }
        return strings;
    }
}
