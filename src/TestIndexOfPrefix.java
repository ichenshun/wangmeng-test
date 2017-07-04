
/**
 * @author wangmeng
 * @date 17/7/3
 */
public class TestIndexOfPrefix {
    public static void main(String[] args) {

        System.out.println(indexOf("abcc", "bc"));

    }

    public static int indexOf(String text, String pattern) {
        if (text.length() < pattern.length()) {
            return -1;
        } else if (text.length() == 0 && pattern.length() == 0) {
            return -1;
        } else {
            for (int i = 0; i < text.length(); i++) {
                if(isEqual(text, i, pattern)){
                    return i;
                }
            }

        }
        return -1;
    }

    private static boolean isEqual(String text, int i, String pattern) {

        for (int j=0; j < pattern.length(); j++) {
            if (i+j>=text.length() || text.charAt(i + j) != pattern.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}