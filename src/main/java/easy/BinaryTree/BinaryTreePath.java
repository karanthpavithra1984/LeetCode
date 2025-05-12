package easy.BinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(n)
 * Space Complexity o(n)
 */

public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, path, res);
        return res;
    }

    private void dfs(TreeNode root, List<Integer> path, List<String> res) {
        if (root == null) return;
        path.add(root.val);

        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size(); i++) {
                sb.append(path.get(i));
                if (i != path.size() - 1) {
                    sb.append("->");
                }

            }
            res.add(sb.toString());
        }

        dfs(root.left, path, res);
        dfs(root.right, path, res);
        path.remove(path.size() - 1);
    }
}
