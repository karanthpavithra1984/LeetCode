package medium.BinaryTree;

import utils.TreeNode;

public class ConstructBinaryTreeFromString {
    /**
     * Time Complexity o(n)
     * Space recursion might take some space which is the height o(h)
     */
    int index = 0;

    public TreeNode str2tree(String s) {
        int negative = 1;
        if (s.charAt(index) == '-') {
            negative = -1;
            index++;
        }

        int number = 0;
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = (s.charAt(index) - '0');
            number = number * 10 + digit;
            index++;
        }

        TreeNode node = new TreeNode(negative * number);

        if (index < s.length() && s.charAt(index) == '(') {
            index++;
            node.left = str2tree(s);
        }

        if (index < s.length() && s.charAt(index) == '(') {
            index++;
            node.right = str2tree(s);
        }

        index++;

        return node;
    }
}

