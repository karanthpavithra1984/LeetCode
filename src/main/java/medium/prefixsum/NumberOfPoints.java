package medium.prefixsum;

public class NumberOfPoints {

    /**
     *
     * Time Complexity - o(n + k) - where n is the length of updates, k is the length
     * Space Complexity o(k) - array of length k
     *
     * @param length
     * @param updates
     * @return int[]
     */

    public int[] getModifiedArray(int length, int[][] updates) {
        int[] arr = new int[length];

        for(int[] update: updates){
            int start = update[0], end = update[1], inc = update[2];

            arr[start] += inc;

            //end+1 because , prefix sum will add the previous value, so we need to negate it first :)
            //Brilliant
            if(end + 1 < length){
                arr[end+1] -= inc;
            }
        }

        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i-1];
        }

        return arr;
    }
}
