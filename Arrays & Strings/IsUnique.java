import java.util.*;
public class IsUnique{

public static void main(String []args){
    String hello = "helo";
    System.out.println(unique(hello));
}
public static boolean unique(String str){
 if(str.length() > 128) return false;

 char []b = str.toCharArray();
 Arrays.sort(b);
 for (int i = 1; i < b.length; i++) {
    if(b[i] == b[i-1]) return false;
     
 }

return true;

}
}

// space O(n)     time O(n logn)

// space o(1) if doesn't consider input storage