package easy.BinaryTree;


import utils.TreeNode;

public class isSubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {


        if(subRoot == null){
            return true;
        }

        if(root == null){
            return false; //Remember this is false, because we reached end without finding a sametree
        }


        if(isSameTree(root, subRoot)){
            return true;
        }

        if(isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot)){
            return true;
        }

        return false;
    }

    private boolean isSameTree(TreeNode tree1, TreeNode tree2){
        if(tree1 == null && tree2 == null){
            return true;
        }

        if(tree1 != null && tree2 != null && tree1.val == tree2.val){
            return isSameTree(tree1.left, tree2.left) && isSameTree(tree1.right, tree2.right);
        }

        return false;
    }
}
