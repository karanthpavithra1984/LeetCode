package medium.BinaryTree;

import utils.TreeNode;

import java.util.Stack;

public class BSTIterator {
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        this.stack = new Stack<>();

        //Similar to Inorder , we are just pushing all the left elements to the stack
        //Until null is returned at the end
        //Time Complexity coould be o(n) in the worst case if the tree is balanced, if not this is only the left side.
        stackPusher(root);
    }

    private void stackPusher(TreeNode root) {
        while(root != null) {
            this.stack.push(root);
            root = root.left;
        }
    }

    public int next() {
        //Time Complexity is o(1)
        TreeNode node = this.stack.pop();

        //Similar to inorder, we return the node , thats just popped,
        //However we need to traverse right now
        //Time Complexity coould be o(n) in the worst case if the tree is balanced, if not this is only the left side.
        if(node.right!= null){
            stackPusher(node.right);
        }

        return node.val;
    }

    public boolean hasNext() {
        //Time Complexity is o(1)
        return !stack.isEmpty();
    }
}
