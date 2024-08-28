public class IsUniqueN{
    public static void main(String[] args) {
        String str = "helo";
        System.out.println(unique(str));
    }

    public static boolean unique(String str){
        boolean []b = new boolean[128];
for (int i = 0; i < str.length(); i++) {
    int val = str.charAt(i);
    if(b[val]) return false;
    b[val] = true;
    
}
      return true;

    }
}

//time O(n)  space O(n) if considering input storage else O(1.)