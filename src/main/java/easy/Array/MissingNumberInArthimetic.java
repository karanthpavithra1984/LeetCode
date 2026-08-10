package easy.Array;

public class MissingNumberInArthimetic {
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int difference = (arr[n - 1] - arr[0]) / n;

        int expected = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] != expected) {
                return expected;
            }

            expected += difference;
        }

        return expected;
    }
}
