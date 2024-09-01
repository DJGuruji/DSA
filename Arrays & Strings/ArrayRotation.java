
public class ArrayRotation {

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "terbottlewa";
        System.out.println(check(s1, s2));
    }

    public static boolean check(String s1, String s2) {
        if (s1.length() == s2.length() && s1.length() > 0) {
            String str = s1 + s1;
            if (str.contains(s2)) {
                return true;
            }
            return false;

        }
        return false;

    }

}

//time and space O(1)
