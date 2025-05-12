package utils;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode parent;
    public TreeNode next;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    TreeNode(int val, TreeNode left, TreeNode right, TreeNode parent) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    TreeNode(int val, TreeNode left, TreeNode right, TreeNode parent, TreeNode next) {
        this.val = val;
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.next = next;
    }

    public TreeNode(int val, TreeNode next) {
        this.val = val;
        this.next = next;
    }
}
