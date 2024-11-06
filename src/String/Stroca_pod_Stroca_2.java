package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stroca_pod_Stroca_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        char[] digit = str.toCharArray();
        char[] chisla = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String alphabetStr = "qwertyuiopasdfghjklzxcvbnm";
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int n2 = 0;
        String outText = "";
        //3[2[ab]c] = ababcababc
        int count = 0;
        while (count < str.length()) {
            for (char smbl : chisla) {
                if (smbl == digit[count]) {
                    sb.append(digit[count]);
                    count++;
                    int n = Integer.parseInt(String.valueOf(sb));
                    for (int i = count; i < n; i++) {
                        if (digit[i] == chisla[i] && digit[i] != '[') {
                            n2 =  digit[i];
                            for (int j = count; j < n2; j++) {
                                if (digit[j] != ']') {
                                    sb2.append(digit[j]);
                                }
                                if (digit[j] == ']') {
                                    break;
                                }
                            }
                        } else {
                            sb2.append(digit[i]);
                            if (digit[i] == ']') {
                                break;
                            }
                        }
                    }
                }
            }
            count++;
        }
        System.out.println(sb);
        System.out.println(sb2);
    }
}