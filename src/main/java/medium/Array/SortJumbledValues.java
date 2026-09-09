package medium.Array;

import java.util.Arrays;

import static java.util.Comparator.comparingInt;

public class SortJumbledValues {
    class Solution {
        public int[] sortJumbled(int[] mapping, int[] nums) {
            int N = nums.length;
            int[] mappedValues = new int[N];

            for (int i = 0; i < N; i++) {
                mappedValues[i] = getMappedValue(mapping, nums[i]);
            }

            Integer[] indices = new Integer[N];
            Arrays.setAll(indices, i -> i);

            Arrays.sort(indices, comparingInt(a -> mappedValues[a]));

            int[] result = new int[N];
            for (int i = 0; i < N; i++) {
                result[i] = nums[indices[i]];
            }

            return result;
        }

        private int getMappedValue(int[] mapping, int num) {
            if (num == 0) {
                return mapping[num];
            }

            int placeValue = 1;
            int mappedValue = 0;

            while (num > 0) {
                int lastDigit = num % 10;
                int newDigit = mapping[lastDigit];

                mappedValue += newDigit * placeValue; //Keep the digit in the same index

                placeValue *= 10; //Move to the next place
                num /= 10; //strip off the last digit
            }

            return mappedValue;
        }

    }
}
