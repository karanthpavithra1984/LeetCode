package easy.BinaryTree;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FindTarget {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();

        inOrder(root, values);

        int left = 0, right = values.size()-1;
        while (left < right){
            int sum = values.get(left) + values.get(right);
            if(sum == k)
                return true;
            if(sum < k){
                right--;
            }else{
                left++;
            }
        }

        return false;


    }

    void inOrder(TreeNode treeNode, List<Integer> values){
        if(treeNode == null){
            return;
        }

        inOrder(treeNode.left, values);
        values.add(treeNode.val);
        inOrder(treeNode.right, values);
    }
}
