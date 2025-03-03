package easy.BinaryTree;

import utils.Node;
import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectToRightNodeII {
    public TreeNode connect(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                //Get the top one
                TreeNode node = queue.poll();

                if(node != null) {
                    //Connect to next one
                    if (i < size - 1) {
                        node.next = queue.peek();
                    }

                    if (node.left != null) {
                        queue.add(node.left);
                    }

                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }

        }

        return root;
    }
}
