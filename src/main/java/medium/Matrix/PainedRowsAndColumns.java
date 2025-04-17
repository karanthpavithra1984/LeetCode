package medium.Matrix;

import java.util.HashMap;
import java.util.Map;

public class PainedRowsAndColumns {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, int[]> numToPosMap = new HashMap<>();
        int ROW = mat.length;
        int COL = mat[0].length;

        for(int r = 0 ;r < ROW; r++){
            for(int c=0; c< COL;c++){
                numToPosMap.put(mat[r][c], new int[]{r,c});
            }
        }

        int[] row = new int[ROW];
        int[] col = new int[COL];

        for(int i=0; i < arr.length; i++){
            if(numToPosMap.containsKey(arr[i])){
                int[] pos = numToPosMap.get(arr[i]);
                int r = pos[0];
                int c= pos[1];

                row[r]++;
                col[c]++;

                if(row[r] == COL || col[c] == ROW){
                    return i;
                }
            }
        }

        return arr.length-1;
    }
}
