package easy.prefixSum;

public class FindTheHighestAltitude {
    /**
     * Time Complexity o(n)
     * Space Complexity o(1)
     *
     * @param gain
     * @return
     */
    public int largestAltitude(int[] gain) {
        int sum = gain[0];
        int maxGain = sum < 0 ? 0 : sum;
        for (int j = 1; j < gain.length; j++) {
            sum += gain[j];
            maxGain = Math.max(maxGain, sum);
        }

        return maxGain;
    }

}
