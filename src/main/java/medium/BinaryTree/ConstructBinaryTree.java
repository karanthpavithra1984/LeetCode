package medium.BinaryTree;

import utils.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTree {
    int preOrderIndex = 0;
    Map<Integer, Integer> indexMap = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //Map Index with value
        for(int i= 0 ; i < inorder.length; i++){
            indexMap.put(inorder[i],i);
        }

        return dfs(preorder, 0, inorder.length-1);
    }

    private TreeNode dfs(int[] preorder, int left, int right){
        if(left > right) return null;
        int root = preorder[preOrderIndex];
        TreeNode treeNode = new TreeNode(root);
        preOrderIndex++;
        int mid = indexMap.get(root);
        // 1 because the preOrder 0 is already covered
        treeNode.left = dfs(preorder, left, mid-1);
        treeNode.right = dfs(preorder, mid+1, right);
        return treeNode;
    }
}
