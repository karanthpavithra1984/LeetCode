package medium.Dfs;

import utils.NestedInteger;

import java.util.List;

/**
 * Time Complexity o(n) - it has to go through each and every element
 * Space complexity o(n) - all the recursion will take some space
 */

public class DepthSum {

    public int depthSum(List<NestedInteger> nestedList) {
        return dfs(nestedList, 1);
    }

    private int dfs(List<NestedInteger> nestedList, int depth) {
        int sum = 0;
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                sum += nestedInteger.getInteger() * depth;
            } else {
                sum += dfs(nestedInteger.getList(), depth + 1);
            }
        }

        return sum;

    }
}
