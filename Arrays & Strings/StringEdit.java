public class StringEdit{
    public static void main(String []args){

        String s1 = "pale";
        String s2 = "bae";
        System.out.println(check(s1,s2));
    }

    public static boolean check(String first, String second){
         int len1 = first.length();
         int len2 = second.length();

         if(Math.abs(len1-len2)>1) return false;

         String s1 = len1<len2 ? first : second;
         String s2 = len1<len2 ? second : first;

         int i=0, j=0;
         boolean found = false;

         while(i<s1.length() && j<s2.length()){

              if(s1.charAt(i) != s2.charAt(j)){
                if(found) return false;
                found = true;
                if(len1 == len2)i++; // i must be increment in case of replacement
              }else{
                i++;
              }

             j++;
         }
       return true;
    }
}

// space O(1) && time O(n)