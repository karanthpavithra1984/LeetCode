package easy.BinaryTree;

import utils.TreeNode;

public class ConnectToRightNodeIII {
    public TreeNode connect(TreeNode root) {
        if (root == null) return null;

        TreeNode left = root;

        while(left != null) {
            TreeNode current = left;

            // We need to set this .
            //This ideally is left most in the next level
            left = null;

            while(current != null) {
                if(current.left != null) {
                    //This should be the next right if present
                    //Since the binary tree is not balanced, its not always possible.
                    //So we need to find next in the current node and find its left most child.
                    current.left.next = current.right == null ? getNext(current): current.right;
                    if(left == null) left = current.left;
                }

                if(current.right != null) {
                    current.right.next = getNext(current);
                    if(left == null) left = current.right;
                }


                current = current.next;
            }
        }


        return root;
    }

    private TreeNode getNext(TreeNode current){
        TreeNode traverse = current.next;
        while(traverse != null) {
            if(traverse.left != null) return traverse.left;
            if(traverse.right != null) return traverse.right;
            //If no nodes, go to the next in the level.
            traverse = traverse.next;
        }

        return null;
    }
}
