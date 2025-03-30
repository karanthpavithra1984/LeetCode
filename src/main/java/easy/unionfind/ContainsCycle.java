package easy.unionfind;

import utils.UnionFind;

public class ContainsCycle {
    public boolean containsCycle(char[][] grid) {
        int ROW = grid.length;
        int COL = grid[0].length;

        UnionFind unionFind = new UnionFind(ROW * COL);

        int[][] directions = new int[][]{{1,0},{0,1}};

        for(int r=0; r < ROW; r++){
            for(int c=0; c< COL; c++){
                // check right and bottom and union them.
                for(int[] direction: directions){
                    int newRow = r + direction[0];
                    int newCol = c + direction[1];

                    if(newRow >= ROW || newCol >= COL){
                        continue;
                    }

                    //If its equal, check if there is already a union exists
                    if(grid[r][c] == grid[newRow][newCol]){
                        if(!unionFind.union(r*COL + c, newRow*COL + newCol)){
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
