public class MatrixRotation{

    public static void main(String[] args) {
        int [][]a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        check(a);
        
    }
    public static void check(int [][]a){
        int n = a.length;
        if(n == 0 || a.length != a[0].length){
            System.out.println("Not square matrix");
            System.exit(0);

        }
        for(int layer =0; layer<n/2; layer++){
            int first = layer;
            int last = n-1-layer;
            for (int i = first; i < last; i++) {
                int offset = i-first;
                int top = a[first][i];
                a[first][i] = a[last-offset][first];
                a[last-offset][first] = a[last][last-offset];
                a[last][last-offset] = a[i][last];
                a[i][last] = top;

                
            }

        }

           for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d\t", a[i][j]);

            }
            System.out.println();
        }


    }
}