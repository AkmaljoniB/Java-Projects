package Codingbat.String_2;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        String s ="";
        for (int i = 0 ; i < count;i++){
            s=s.concat(word.concat(sep));
        }
        return s.substring(0,s.length()-sep.length());
    }
}
