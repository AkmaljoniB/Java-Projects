package Codingbat.Functional_2;

import java.util.List;

public class NoZ {
    public List<String> noZ(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            for (int j = 0 ;j<strings.get(i).length();j++){
                if (strings.get(i).substring(j,j+1).equals("z")){
                    strings.remove(i);
                    i--;
                    break;
                }
            }
        }
        return strings;
    }
}
