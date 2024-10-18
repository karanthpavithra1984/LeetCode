package easy.Array;

/**
 * Time Complexity - o(n)
 * Space Complexity - o(1)
 */
public class SingleNumberI {
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}
