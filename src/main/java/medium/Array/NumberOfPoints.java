package medium.Array;

/**
 * Time Complexity o(n*m)
 * Space Complexity o(n)
 */

public class NumberOfPoints {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] arr = new int[length];

        for(int[] update: updates){
            int start = update[0], end = update[1], inc = update[2];
            while(start <= end){
                arr[start] += inc;
                start++;
            }
        }

        return arr;
    }
}
