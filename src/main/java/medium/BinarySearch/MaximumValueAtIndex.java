package medium.BinarySearch;

public class MaximumValueAtIndex {
    public int maxValue(int n, int index, int maxSum) {
        int right = n - index - 1; //Number of elements on the right side of the index
        int left = index;//Number of elements on the left side of the index.

        long low = 1;
        long high = maxSum;

        long res = 0;

        while (low <= high) {
            long mid = (low + high) / 2;
            long sum = mid;
            long leftSum = 0;
            long rightSum = 0;
            long nextNum = mid - 1; //Considering mid is going to be at index, next element

            //If the number of elements in on the right is less ,then u need to substract
            // the remaining numbers.
            //e.g 9,10(index),9,8,7,6 - 9+8+7+6 - remaining i.e 5+4+3+2+1
            if (right <= nextNum) {
                //The formula is n(n+1)/2 for the sum of natural numbers I.E 1,2,3,4
                //If the right elements are less than the nextNum, then substract remaining
                rightSum = (nextNum * (nextNum + 1)) / 2 - ((nextNum - right) * (nextNum - right + 1)) / 2;
            } else {
                //if we have more right numbers than nextNum, then we need to fill up remaining with 1.
                rightSum = (nextNum * (nextNum + 1)) / 2 + (1 * (right - nextNum));
            }

            //Do the same thing for left
            if (left <= nextNum) {
                //The formula is n(n+1)/2 for the sum of natural numbers I.E 1,2,3,4
                //If the right elements are less than the nextNum, then substract remaining
                leftSum = (nextNum * (nextNum + 1)) / 2 - ((nextNum - left) * (nextNum - left + 1)) / 2;
            } else {
                //if we have more right numbers than nextNum, then we need to fill up remaining with 1.
                leftSum = (nextNum * (nextNum + 1)) / 2 + (1 * (left - nextNum));
            }

            sum += leftSum + rightSum;

            if (sum <= maxSum) {
                //We can go up
                res = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return (int) res;
    }
}
