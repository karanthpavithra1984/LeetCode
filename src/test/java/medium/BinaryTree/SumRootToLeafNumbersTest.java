package medium.BinaryTree;

import org.junit.Test;
import utils.TreeNode;

public class SumRootToLeafNumbersTest {
    SumRootToLeafNumbers s = new SumRootToLeafNumbers();

    @Test
    public void test() {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);

        assert s.sumNumbers(tree) == 25;
    }
}
