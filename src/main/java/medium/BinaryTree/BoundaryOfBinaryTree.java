package medium.BinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundaryOfBinaryTree {
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        //Add the root
        if(!isLeaf(root)){
            result.add(root.val);
        }
        //Add all the left nodes which dont have leaves
        TreeNode leftTrace = root.left;
        while(leftTrace != null){
            //Only add the non leaf
            if(!isLeaf(leftTrace)) {
                result.add(leftTrace.val);
            }

            //If there is no leftNode add right and add it to the result
            //Or else right is inside and will be ignored
            if(leftTrace.left != null){
                leftTrace = leftTrace.left;
            }else{
                leftTrace = leftTrace.right;
            }
        }

        //Add leaves now
        TreeNode leaveTrace = root;
        addLeaves(result, leaveTrace);

        //Now add the right leaves.
        // Since we need it in reverse order, add it to the stack

        TreeNode rightTrace = root.right;
        Stack<Integer> values = new Stack<>();

        while(rightTrace != null){
            if(!isLeaf(rightTrace)){
                values.add(rightTrace.val);
            }

            if(rightTrace.right != null){
                rightTrace = rightTrace.right;
            }else{
                rightTrace = rightTrace.left;
            }
        }

        while(!values.isEmpty()){
            result.add(values.pop());
        }

        return result;
    }

    private void addLeaves(List<Integer> result, TreeNode leaveTrace){
        if(isLeaf(leaveTrace)){
            result.add(leaveTrace.val);
            return;
        }

        if(leaveTrace.left != null){
            addLeaves(result, leaveTrace.left);
        }

        if(leaveTrace.right != null){
            addLeaves(result, leaveTrace.right);
        }
    }

    private boolean isLeaf(TreeNode root){
        return root.left == null && root.right == null;
    }
}
