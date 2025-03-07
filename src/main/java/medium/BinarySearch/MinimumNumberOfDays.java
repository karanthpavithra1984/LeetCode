
package medium.BinarySearch;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Time Complexity n*logd - d is maximum number of days
 */

public class MinimumNumberOfDays {
    public int minDays(int[] bloomDay, int m, int k) {
        int start = 0;//array index starts at 0
        //Get the max day or the last day the flower is going to boom
        int end = IntStream.of(bloomDay).max().getAsInt();
        int numberOfBoquets =0 ;
        int minDays = -1;

        //Get a middle day and see if we can pick adjacent flowers of k and can make m bouqets from it

        while (start <= end) { //This has to be less than equal because its possible that we will have to wait until the last day
            int mid = start + (end - start) / 2;

            int count = 0; //count adjancet flowers
            numberOfBoquets = 0;
            for (int i = 0; i < bloomDay.length; i++) {
                if (bloomDay[i] <= mid) { //Flowers have bloomed
                    count++;
                } else {
                    count = 0; //Break it because the flowers have'nt boomed, we cant get adjacent flowers
                }

                if (count == k) {
                    numberOfBoquets++;
                    count=0;
                }
            }

            if (numberOfBoquets >= m) {
                //Enough flowers have bloomed, we can hopefully get boquets sooner
                //You need minimum hence better to keep track of it.
                minDays = mid;
                end = mid-1; //remember to this if there is equal , because its inclusive
            } else {
                //Havent gotten enough flowers yet, we need to wait for more days
                //Hence move towards the right
                start = mid + 1;
            }
        }
        return  minDays;
    }
}
