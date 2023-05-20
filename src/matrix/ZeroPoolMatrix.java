package matrix;

import java.util.LinkedList;
import java.util.Queue;

public class ZeroPoolMatrix {
    public static void main(String[] args) {
        {

            int m = 4 ; // rows
            int n = 4;  // columns
            int[][]  in = {{0, 1, 1, 0},
                           {0, 1, 0, 1},
                           {1, 1, 0, 1},
                           {0, 1, 0 ,1}};
            boolean [][] visited = new boolean[m][n];
            int count = 0;
            for(int i = 0; i < m; i++){
                for(int j = 0; j < n ; j++){
                    count = 0;
                    if(visited[i][j] == false){
                        Queue<Pair> zeroNeighbour = new LinkedList<>();
                        if(in[i][j] == 0) {
                            zeroNeighbour.add(new Pair(i, j));
                            visited[i][j] = true;

                        }
                        while(!zeroNeighbour.isEmpty()){
                            Pair p = zeroNeighbour.poll();
                            count++;
                            zeroNeighbour.addAll(findZeroNeighbour(p.x, p.y, m - 1, n - 1, in, visited));
                        }
                    }
                    if(count > 0){
                        System.out.println(count + " ");
                    }
                }
            }


        }
    }

    private static Queue<Pair> findZeroNeighbour(int x, int y, int m, int n, int[][] in,  boolean [][] visited){
        Queue<Pair> zeroVal = new LinkedList<Pair>();
            for (int i = Math.max(0, x - 1); i <= Math.min(x + 1, m); i++) {
                for (int j = Math.max(0, y - 1); j <= Math.min(y + 1, n); j++) {
                        if ((x != i || y != j) && in[i][j] == 0 && visited[i][j] == false) {
                            zeroVal.add(new Pair(i, j));
                        }
                    visited[i][j] = true;
                }
            }
        return zeroVal;
    }
}

class Pair {
    int x;
    int y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return x+"===="+y;
    }

}
