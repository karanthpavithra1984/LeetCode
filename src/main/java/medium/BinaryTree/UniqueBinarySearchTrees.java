package medium.BinaryTree;

public class UniqueBinarySearchTrees {
    /**
     * Time Complexity o(n^2) its (2+n)(n-1)/2
     * Space Complexity o(n); - space for
     *
     * @param n
     * @return
     */
    public int numTrees(int n) {
        int[] numTrees = new int[n + 1];
        numTrees[0] = 1;
        numTrees[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                numTrees[i] += numTrees[j - 1] * numTrees[i - j];
            }
        }

        return numTrees[n];
    }
}
