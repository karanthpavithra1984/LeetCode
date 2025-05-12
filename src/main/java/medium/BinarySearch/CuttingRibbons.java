package medium.BinarySearch;

import java.util.Arrays;

public class CuttingRibbons {
    public int maxLength(int[] ribbons, int k) {
        int maxValue = Arrays.stream(ribbons).max().getAsInt();

        //Now binary search through this and find a value which would give us the totalRibbins

        int minValue = 1;
        int saveMinValue = 0;

        while (minValue <= maxValue) {
            int midValue = minValue + (maxValue - minValue) / 2;

            int totalRibbons = 0;
            for (int ribbon : ribbons) {
                totalRibbons += ribbon / midValue;

                if (totalRibbons >= k) {
                    break;
                }
            }


            if (totalRibbons < k) {
                maxValue = midValue - 1;
            } else {
                saveMinValue = midValue;
                minValue = midValue + 1;
            }

        }

        return saveMinValue;
    }
}
