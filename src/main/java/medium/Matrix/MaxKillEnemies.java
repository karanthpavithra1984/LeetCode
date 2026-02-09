package medium.Matrix;

public class MaxKillEnemies {
    public int maxKilledEnemies(char[][] grid) {
      int maxEnemies = 0;
      int row = grid.length;
      int col = grid[0].length;

      int rowHit = 0;
      int[] colHit = new  int[col];

      for(int i = 0; i < row; i++) {
          for(int j = 0; j < col; j++) {

              //Reset row at the col = 0 or if a wall is hit
              if(j == 0 || grid[i][j-1] == 'W'){
                  rowHit = 0;
                  //Move across the column
                  for(int k = j ; k < col ; k++){
                      if(grid[i][k] == 'W'){
                          break;
                      }else if(grid[i][k] == 'E'){
                          rowHit++;
                      }
                  }
              }

              if(i == 0 || grid[i-1][j] == 'W'){
                  colHit[j] = 0;
                  for(int k = i; k < row; k++){
                      if(grid[k][j] == 'W'){
                          break;
                      }else if(grid[k][j] == 'E'){
                          colHit[j]++;
                      }
                  }
              }

              if(grid[i][j] == '0'){
                  maxEnemies = Math.max(maxEnemies, rowHit + colHit[j]);
              }
          }
      }

      return maxEnemies;
    }
}
