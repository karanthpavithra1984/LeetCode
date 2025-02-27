package medium.Matrix;

/**
 * Time o(m*n)
 */
public class MaximalMatrix {
    Integer[][] visited ;
    private int ROWS;
    private int COLS;
    public int maximalSquare(char[][] matrix) {
        ROWS = matrix.length;
        COLS = matrix[0].length;

        visited = new Integer[matrix.length][matrix[0].length];

        int max = 0;

        for(int r = 0; r < matrix.length; r++){
            for(int c= 0 ; c< matrix[0].length ; c++){
                if(matrix[r][c] == '1'){
                    max = Math.max(max, dfs(matrix, r, c));
                }
            }
        }

        //Area of square
        return max * max;
    }

    private int dfs(char[][] matrix, int r, int c){
        if(r < 0 || r >= ROWS || c < 0 || c >= COLS || matrix[r][c] == '0') return 0;

        if(visited[r][c] != null) return visited[r][c];


        int diagonal = dfs(matrix, r+1,c+1);
        int down = dfs(matrix,r+1,c);
        int right = dfs(matrix, r, c+1);

        visited[r][c] = Math.min(Math.min(diagonal, down),right) + 1;

        return visited[r][c];
    }
}
