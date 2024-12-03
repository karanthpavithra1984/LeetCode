package easy.BinarySearch;

import org.junit.Test;
import utils.TreeNode;

public class ClosestValueTest {
    ClosestValue closestValue = new ClosestValue();

    @Test
    public void testClosestValue() {
        TreeNode treeNode = new TreeNode(4);
        //root = [4,2,5,1,3], val = 3.714286
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);
        treeNode.right = new TreeNode(7);

        assert closestValue.closestValue(treeNode, 3.71286) == 4;
        assert closestValue.closestValue(treeNode, 3.5) == 3;

    }
}
