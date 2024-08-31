public class PermuN {

    public static void main(String[] args) {
        String s = "god";
        String t = "odg";
        System.out.println(checkPermu(s, t));  // This should print true
    }

    public static boolean checkPermu(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[128];  

        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i)]++;
            charCount[t.charAt(i)]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}


//space O(n)  time O(n)
// space o(1) if doesn't consider input storage
