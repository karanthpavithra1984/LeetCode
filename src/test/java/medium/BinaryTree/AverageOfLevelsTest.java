package medium.BinaryTree;

import org.junit.Test;
import utils.GeneralUtils;
import utils.TreeNode;

import static org.junit.Assert.assertEquals;

public class AverageOfLevelsTest {
    AverageOfLevels a = new AverageOfLevels();

    @Test
    public void averageOfLevels() {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.right = new TreeNode(7);

        assertEquals(GeneralUtils.convertToCommaSeperatedString(a.averageOfLevels(treeNode)), "3.0,14.5,11.0");
    }
}
