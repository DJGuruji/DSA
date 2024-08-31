
public class Palpermu {

    public static void main(String[] args) {
        String str = "heehllo";
        System.out.println(check(str));
    }

    public static boolean check(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();

        int[] count = new int[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            count[val]++;
        }
        int oddcount = 0;
        for (int i : count) {
            if (i % 2 != 0) {
                oddcount++;
            }
            if (oddcount > 1) {
                return false;
            }
        }
        return true;

    }

}
