package Codingbat.Ap_1;

public class WordsFront {
    public String[] wordsFront(String[] words, int n) {
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = words[i];
        }
        return arr;
    }
}
