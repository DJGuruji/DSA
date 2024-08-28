public class Urlfy{
    public static void main(String []args){
        String str = "mr john nair";
        int n = str.length();
        check(str,n);
    }

public static void check(String str, int n){

     char []a = str.toCharArray();
     int space = 0;
     for(int i =0; i<n; i++){
        if(a[i] == ' '){
            space++;
        }

     }
     int index = n+space*2;
     char b[] = new char[index];

    int j = index-1;
    for( int i=n-1; i>=0; i--){
        if(a[i] == ' '){
            b[j--] ='0';
            b[j--] ='2';
            b[j--] = '%';
        }
        else{
            b[j--] = a[i];
    }
    }

    for(char i : b){
        System.out.print(i);
    }

}


}

// time and space  O(n)