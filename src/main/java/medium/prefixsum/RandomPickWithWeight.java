package medium.prefixsum;

public class RandomPickWithWeight {
    private int[] prefixSum;
    private int totalSum;

    public RandomPickWithWeight(int[] w) {
        prefixSum = new int[w.length];

        //o(n)
        for (int i = 0; i < w.length; i++) {
            this.totalSum += w[i];
            this.prefixSum[i] = this.totalSum;
        }
    }

    public int pickIndex() {
        double target = Math.random() * this.totalSum;

        //ologn
        //We can use binary search
        int low = 0, right = this.prefixSum.length - 1;

        while (low < right) {
            //The range is with in Integer.max and min
            //If its not , then use low + (high - low)/2
            int mid = (low + right) / 2;

            if (target > this.prefixSum[mid]) {
                low = mid + 1;
            } else {
                right = mid;
            }
        }

        return low;
    }
}
