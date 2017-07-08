import java.util.ArrayList;
import java.util.List;


public class Permutation {

    public static void main(String[] args) {
        System.out.println(doPermuation("a"));
        System.out.println(doPermuation("ab"));
        System.out.println(doPermuation("abc"));
        System.out.println(doPermuation("abcd"));
    }

    public static List<String> doPermuation(String text) {
        List<String> p = new ArrayList<>();
        if (text.length() == 0) {
            return p;
        }

        if (text.length() == 1) {
            p.add(text);
            return p;
        }

        for (int i = 0; i < text.length(); i++) {
            List<String> t = doPermuation(subString(text, i));
            for (int j = 0; j < t.size(); j++) {
                p.add(text.charAt(i) + t.get(j));
            }
        }
        return p;
    }

    private static String subString(String text, int i) {
        return text.substring(0, i) + text.substring(i+1, text.length());
    }
}
