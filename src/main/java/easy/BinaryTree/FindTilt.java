package easy.BinaryTree;

import utils.TreeNode;

public class FindTilt {
    int totalTilt = 0;
    public int findTilt(TreeNode root) {
        this.totalTilt = 0;
        this.valueSum(root);
        return this.totalTilt;
    }

    private int valueSum(TreeNode node){
        if(node == null)
            return 0;

        int leftSum = this.valueSum(node.left);
        int rightSum = this.valueSum(node.right);
        int tilt =  Math.abs(leftSum-rightSum);
        this.totalTilt += tilt;

        return node.val + leftSum + rightSum;
    }


}
