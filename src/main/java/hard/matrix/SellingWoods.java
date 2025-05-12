package hard.matrix;

/**
 * Time o(m*n(m+n))
 * Space 2(m*n)
 */

public class SellingWoods {
    public long sellingWood(int m, int n, int[][] prices) {
        int height = m;
        int width = n;

        //The prices they are list of two
        //Lets either Convert them to a map of map or a simple array with value
        int[][] priceByDim = new int[height + 1][width + 1];
        for (int[] price : prices) {
            priceByDim[price[0]][price[1]] = price[2];
        }

        Long[][] cache = new Long[height + 1][width + 1];
        //Lets cut it recursively both horizontaly and verticaly

        return recursiveCut(height, width, priceByDim, cache);
    }

    private long recursiveCut(int height, int width, int[][] prices, Long[][] cache) {
        if (cache[height][width] != null) return cache[height][width];

        long money = prices[height][width];

        //Height cannot be 0
        //Cutting it horizantly, will keep the width same
        //But it will cut the height into i, h-i
        //Since we are saving the value , its better we go faster :)
        //This is going to cover all the individual matrixes as well
        for (int i = 1; i <= height / 2; i++) {
            //Increase the height until its height - 1;
            money = Math.max(money, recursiveCut(i, width, prices, cache)
                    + recursiveCut(height - i, width, prices, cache));
        }
        //Cut vertically
        //Height remains same , but it will cutinto j, w-j
        for (int j = 1; j <= width / 2; j++) {
            money = Math.max(money, recursiveCut(height, j, prices, cache)
                    + recursiveCut(height, width - j, prices, cache));
        }

        return cache[height][width] = money;
    }
}
