package medium.BinaryTree;

import utils.TreeNode;

public class LowestCommonAncestorIII {
    public TreeNode lowestCommonAncestor(TreeNode p, TreeNode q) {
        TreeNode nodeA = p;
        TreeNode nodeB = q;

        //Go to the other node , since it has hit the parent and they havent coincided yet
        while(nodeA != nodeB) {
            nodeA = nodeA == null? p: nodeA.parent;
            nodeB = nodeB == null? q: nodeB.parent;
        }

        return nodeA;
    }
}
