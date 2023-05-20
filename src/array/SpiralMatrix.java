package array;

public class SpiralMatrix {
    public static void main(String[] args) {
        int r = 4, c = 4;
        int matrix[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15,16}};
        print(r, c, matrix);
    }
    private static void print(int m, int n, int[][] matrix){
        int k=0;
        int l=0;
        while(k < m && l < n){
            for(int i = l; i < n; i++){
                System.out.print(matrix[k][i]+" ");
            }
            k++;
            for(int i = k; i < m; i++){
                System.out.print(matrix[i][n-1]+" ");
            }
            n--;
            for(int i = n-1; i >= l; i--){
                System.out.print(matrix[m-1][i]+" ");
            }
            m--;
            for(int i = m-1; i >=k; i--){
                System.out.print(matrix[i][l]+" ");
            }
            l++;
        }
    }
}
