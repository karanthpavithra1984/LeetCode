package easy.BinaryTree;

import utils.TreeNode;

public class DiameterOfBinaryTree {
    /**
     * Diameter is basically longest left + longest right
     * @param root
     * @return
     *
     *
     * Time Complexity o(n)
     * Space Complexity o(n)
     */
    private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        longestPathOfTree(root);
        return diameter;
    }

    private int longestPathOfTree(TreeNode root){
        if(root == null) return 0;

        int leftLongestPath = longestPathOfTree(root.left);
        int rightLongestPath = longestPathOfTree(root.right);

        diameter = Math.max(diameter, leftLongestPath+rightLongestPath);

        //you need to add one for the parent
        return Math.max(leftLongestPath, rightLongestPath) + 1;
    }
}
