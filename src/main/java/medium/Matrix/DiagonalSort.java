package medium.Matrix;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class DiagonalSort {
    public int[][] diagonalSort(int[][] mat) {
        int R  = mat.length;
        int C = mat[0].length;

        Map<Integer, Queue<Integer>> map = new HashMap<>();

        for(int r = 0; r < R; r++){
            for(int c = 0; c < C; c++){
                map.putIfAbsent(c-r,new PriorityQueue<>());
                map.get(c-r).offer(mat[r][c]);
            }
        }

        for(int r = 0; r < R; r++){
            for(int c = 0; c < C; c++){
                mat[r][c] = map.get(c-r).poll();
            }
        }

        return mat;
    }
}
