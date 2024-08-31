
public class StringCompression {

    public static void main(String[] args) {
        String str = "aabbbccccddddd";
        check(str);
    }

    public static void check(String str) {

        int count = 0;
        StringBuilder compress = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            count++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compress.append(str.charAt(i));
                compress.append(count);
                count = 0;

            }

        }
        System.out.println(compress);
    }
}
