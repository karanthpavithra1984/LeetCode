package utils;

import java.util.List;

import static java.util.stream.Collectors.joining;

public class BinaryTreeUtils {

    public static String flattenedTree(TreeNode treeNode) {
        String value = flattenTree(treeNode);
        return value.substring(0, value.length() - 1);
    }


    private static String flattenTree(TreeNode treeNode) {
        StringBuilder value = new StringBuilder();
        if (treeNode == null) {
        } else {

            value.append(treeNode.val + ",");
            value.append(flattenTree(treeNode.left));
            value.append(flattenTree(treeNode.right));
        }

        return value.toString();
    }

    public static String commaSeperatedString(List<Integer> nodes) {
        return nodes.stream().map(x -> String.valueOf(x)).collect(joining(","));
    }

    public static TreeNode getTreeNode() {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(8);

        treeNode.left.left = new TreeNode(2);
        treeNode.left.right = new TreeNode(4);
        treeNode.left.left.left = new TreeNode(1);

        treeNode.right.right = new TreeNode(9);
        treeNode.right.left = new TreeNode(7);
        treeNode.right.left.left = new TreeNode(6);
        return treeNode;
    }

    public static TreeNode getInvalidTreeNode() {
        TreeNode treeNode = new TreeNode(5);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(3);

        treeNode.left.left = new TreeNode(11);
        treeNode.left.right = new TreeNode(7);
        return treeNode;
    }
}
