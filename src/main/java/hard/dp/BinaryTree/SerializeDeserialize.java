package hard.dp.BinaryTree;

import com.sun.source.tree.Tree;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SerializeDeserialize {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> result = new ArrayList<>();
        dfsSeralize(root, result);
        return String.join(",", result);
    }

    private void dfsSeralize(TreeNode root, List<String> result){
        if(root == null) {
            result.add("N");
            return;
        }

        result.add(String.valueOf(root.val));
        dfsSeralize(root.left, result);
        dfsSeralize(root.right, result);
    }

    private int index;

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        index = 0;
        String[] nodes = data.split(",");
        return dfsDeserialize(nodes);
    }

    private TreeNode dfsDeserialize(String[] nodes){
        if(nodes[index].equals("N")){
            index++;
            return null;
        }

        TreeNode node = new TreeNode(Integer.parseInt(nodes[index]));
        index++;
        node.left = dfsDeserialize(nodes);
        node.right = dfsDeserialize(nodes);
        return node;
    }
}
