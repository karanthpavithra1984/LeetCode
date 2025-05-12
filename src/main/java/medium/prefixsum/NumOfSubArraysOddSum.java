package medium.prefixsum;

public class NumOfSubArraysOddSum {
    public int numOfSubarrays(int[] arr) {
        //We can do brute force, go through the array
        // in two loops and calculate the sub array and add to the result

        //In the other way , we can do a prefix sum
        // and add the previous odd occurances to the count if its even
        // or add previous even occurances if the count is odd.

        //Check neet code if ur confused.

        int oddCount = 0;
        int evenCount = 0;
        int prefixSum = 0;
        int result = 0;
        final int MOD = 1000000007;

        for (int a : arr) {
            prefixSum += a;

            //If its even
            if (prefixSum % 2 == 0) {
                //Add all the previous Odd encounters
                result += oddCount;
                evenCount++;
            } else {//If its odd
                //All the previous even encounters
                result += evenCount + 1;
                oddCount++;
            }

            result += result % MOD;


        }

        return result % MOD;
    }
}
