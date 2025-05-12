package medium.BinarySearch;

/**
 * nlogm
 */
public class MaximumCandies {
    public int maximumCandies(int[] candies, long k) {
        int minCandy = 1;
        int maxCandy = 0;
        for (int candy : candies) {
            maxCandy = Math.max(maxCandy, candy);
        }

        while (minCandy <= maxCandy) {
            int midCandy = minCandy + (maxCandy - minCandy) / 2;

            long numOfChildren = 0;

            for (int candy : candies) {
                numOfChildren += candy / midCandy;
                if (numOfChildren > k) {
                    break;
                }
            }


            if (numOfChildren < k) {
                //We can choose a more lesser value
                maxCandy = midCandy - 1;
            } else {
                //we need more candies from the pile
                minCandy = midCandy + 1;
            }
        }

        return maxCandy;
    }
}
