package medium.Matrix;

public class SpiralMatrixIII {

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int step = 0, direction  = 0;
        // East, South, West, North
        int[][] directions = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int[][] res = new int[rows * cols][2];

        //Save the first
        res[0] = new int[] { rStart, cStart };
        int count = 1;

        while (count < rows * cols) {
            //Increase when the direction is east/west
            if(direction == 0 || direction == 2) step++;

            for(int i= 0 ; i < step ; i++) {

                rStart += directions[direction][0];
                cStart += directions[direction][1];


                if(rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    res[count++] = new int[] { rStart, cStart };
                }
                if (count == rows * cols) {
                    return res;
                }
            }


            direction = (direction  + 1) % 4;
        }

        return res;
    }
}
