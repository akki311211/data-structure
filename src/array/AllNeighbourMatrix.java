package array;

public class AllNeighbourMatrix {
    public static void main(String[] args) {
        int r = 4, c = 4;
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                         {9, 10, 11, 12},
                        {13, 14, 15,16}};
        print(matrix, r , c , 1, 0);
    }
    private static void print(int matrix[][], int row_limit, int column_limit, int i, int j){
        if(row_limit > 0){
            for(int x = Math.max(0, i-1); x <= Math.min(i+1, row_limit); x++){
                for(int y = Math.max(0, j-1); y <= Math.min(j+1, column_limit); y++){
                    if(x != i || y != j){
                        System.out.print(matrix[x][y] + " ");

                    }
                }
            }
        }
    }
}
