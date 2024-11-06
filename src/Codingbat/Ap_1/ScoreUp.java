package Codingbat.Ap_1;

public class ScoreUp {
    public int scoreUp(String[] key, String[] answers) {
        int a = 0;
        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) {
                a = a + 4;
            } else if (!answers[i].equals("?")) {
                a--;
            }
        }
        return a;
    }
}
