package Codingbat.String_2;

public class WordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("XY123XY", "XY"));
    }

    public static String wordEnds(String str, String word) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + word.length() - 1 == str.length()) {
                break;
            }
            if (str.substring(i, i + word.length()).equals(word)) {
                if (i - 1 == -1 && i + word.length() == str.length()) {
                    s = "";
                } else if (i - 1 == -1) {
                    s = s.concat(str.substring(i + word.length(), i + word.length() + 1));
                } else if (i + word.length() == str.length()) {
                    s = s.concat(str.substring(i - 1, i));
                } else {
                    s = s.concat(str.substring(i - 1, i));
                    s = s.concat(str.substring(i + word.length(), i + word.length() + 1));
                }
            }
        }
        return s;
    }
}
