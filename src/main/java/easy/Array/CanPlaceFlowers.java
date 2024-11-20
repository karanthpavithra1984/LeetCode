package easy.Array;

public class CanPlaceFlowers {
    /**
     * Time Complexity o(n)
     * Space complexity o(1)
     * @param flowerbed
     * @param n
     * @return
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if( n== 0) return true;
        int i = 0;
        int flowerBedLen = flowerbed.length;
        while (i < flowerBedLen) {
            if (flowerbed[i] == 0) {
                boolean nextPlotEmpty = i+1 < flowerBedLen? flowerbed[i + 1] != 1 : true;
                boolean previousPlotEmpty = i > 0 ? flowerbed[i - 1] != 1 : true;
                if (nextPlotEmpty && previousPlotEmpty) {
                    flowerbed[i] = 1;
                    n--; //can  plant here;
                }
            }

            i++;

            if (n == 0) {
                return true;
            }

        }

        return false;
    }
}
