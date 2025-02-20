package medium.BinarySearch;

import java.util.stream.IntStream;

public class MinimumNumberOfDays {
    public int minDays(int[] bloomDay, int m, int k) {
        int start = 0;//array index starts at 0
        //Get the max day or the last day the flower is going to boom
        int end = IntStream.of(bloomDay).max().getAsInt();
        int numberOfBoquets = 0;

        //Get a middle day and see if we can pick adjacent flowers of k and can make m bouqets from it

        while (start <= end) {
            int mid = start + (end - start) / 2;

            int count = 0; //count adjancet flowers
            for (int i = 0; i < bloomDay.length; i++) {
                if (bloomDay[i] <= mid) { //Flowers have bloomed
                    count++;
                } else {
                    count = 0; //Break it because the flowers have'nt boomed, we cant get adjacent flowers
                }

                if (count == k) {
                    numberOfBoquets++;
                    break;
                }
            }

            if (numberOfBoquets >= k) {
                //Enough flowers have bloomed, we can hopefully get boquets sooner
                end = mid - 1;
            } else {
                //Havent gotten enough flowers yet, we need to wait for more days
                start = mid + 1;
            }
        }
        return end;

    }
}
