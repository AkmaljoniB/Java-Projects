package Codingbat.Ap_1;

public class WordsCount {
    public int wordsCount(String[] words, int len) {
        int a =0;
        for (int i =0;i<words.length;i++){
            if (words[i].length()==len){
                a++;
            }
        }
        return a;
    }
}
