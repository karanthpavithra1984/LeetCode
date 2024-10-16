package easy.Array;

import org.junit.Test;
import utils.GeneralUtils;
import utils.TreeNode;

public class SortedArrayToBstTest {
    SortedArrayToBst sortedArrayToBst = new SortedArrayToBst();

    @Test
    public void testSortedArrayBst(){
        TreeNode treeNode = sortedArrayToBst.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        GeneralUtils.validateTreeNode(treeNode, "0,-10,-3,5,9");
    }
}
