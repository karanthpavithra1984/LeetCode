package medium.BinarySearch;

public class MinimumLimitOfBallsInABag {
    public int minimumSize(int[] nums, int maxOperations) {
        int minSize = 1;
        int maxSize = 0;

        for(int n: nums){
            maxSize = Math.max(maxSize, n);
        }

        while(minSize < maxSize){
            int mid = minSize + (maxSize - minSize) / 2;
            int totalOperations = 0;

            for(int n: nums){
                //Try splitting the bags into the size of mid and see how many operations u would need
                //-1 because you need 1 operation to split something into two.
                totalOperations += Math.ceil((double)n/mid) - 1;

                if(totalOperations > maxOperations){
                    break;
                }
            }

            if(totalOperations > maxOperations){
                minSize = mid + 1;
            }else{
                maxSize = mid;
            }

        }

        return maxSize;
    }
}
