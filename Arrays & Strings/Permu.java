
import java.util.Arrays;

public class Permu {

    public

    static void main(String[] args) {
        String s = "god";
        String t = "odg";
        System.out.println(checkPermu(s, t));

    }

    public static boolean checkPermu(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char []a = s.toCharArray();
        char []b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);

    }
}

// space O(n)  time O(n logn)