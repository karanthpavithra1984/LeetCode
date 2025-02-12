package medium.BinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();

        pathSumdfs(root, targetSum, res, new ArrayList<>());
        return res;
    }

    private void pathSumdfs(TreeNode root, int remainingSum, List<List<Integer>> res, List<Integer> path) {
        if (root == null) return;

        path.add(root.val);

        if (root.left == null && root.right == null && remainingSum == root.val) {
            //Copying a list to a list takes time , hence o(n)
            res.add(new ArrayList<>(path));
        }

        //o(n)
        pathSumdfs(root.left, remainingSum - root.val, res, path);
        pathSumdfs(root.right, remainingSum - root.val, res, path);

        path.remove(path.size() - 1);

    }
}
