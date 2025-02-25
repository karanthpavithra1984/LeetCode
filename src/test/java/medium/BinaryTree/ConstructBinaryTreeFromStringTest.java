package medium.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

public class ConstructBinaryTreeFromStringTest {

    @Test
    public void constructBinaryTree() {
        TreeNode root1 = new ConstructBinaryTreeFromString().str2tree("51(232)(434)");
        TreeNode root = new ConstructBinaryTreeFromString().str2tree("-4(2(3)(1))(6(5)(7))");
        TreeNode treeNode = new ConstructBinaryTreeFromString().str2tree("4(2(3)(1))(6(5))");
        TreeNode treeNode2 = new ConstructBinaryTreeFromString().str2tree("4(2(3)(1))(6(5)(7))");
    }
}
