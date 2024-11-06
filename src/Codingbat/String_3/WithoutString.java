package Codingbat.String_3;

public class WithoutString {
    public static void main(String[] args) {
        System.out.println(withoutString("abxxxab", "x"));
    }

    public static String withoutString(String base, String remove) {
        for (int i = 0; i < base.length() - remove.length() + 1; i++) {
            if (base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
                base = base.substring(0, i).concat(base.substring(i + remove.length()));
                if (remove.length() == 1) {
                    i = i - remove.length();
                } else {
                    i = i - remove.length() + 1;
                }
            }
        }
        return base;
    }
}
