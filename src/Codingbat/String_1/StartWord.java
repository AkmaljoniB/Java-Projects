package Codingbat.String_1;

public class StartWord {
    public String startWord(String str, String word) {
        if (word.length()>str.length()){
            return "";
        }
        if (!str.substring(0, 1).equals(word.substring(0,1)) && str.substring(1, word.length()).equals(word.substring(1)) || str.substring(0, word.length()).equals(word)){
            return str.substring(0, word.length());
        }
        return "";
    }
}
