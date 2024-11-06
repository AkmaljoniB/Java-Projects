package Codingbat.Ap_1;

import java.util.ArrayList;
import java.util.List;

public class WordWithoutList {
    public List wordsWithoutList(String[] words, int len) {
        ArrayList<String> Arraylist = new ArrayList<>();
        for (int i = 0; i<words.length;i++){
            if (words[i].length()!=len) {
                Arraylist.add(words[i]);
            }
        }
        return Arraylist;
    }
}
