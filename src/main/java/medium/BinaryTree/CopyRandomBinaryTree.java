package medium.BinaryTree;

import utils.Node;
import utils.NodeCopy;

import java.util.HashMap;
import java.util.Map;

/**
 * tIME And space o(n)
 */

public class CopyRandomBinaryTree {
    Map<Node, NodeCopy> cloneNodeMap = new HashMap<>();
    public NodeCopy copyRandomBinaryTree(Node root) {
        Node head = root;

        NodeCopy nodeCopy = deepCopy(head);

        copyRandomPointers(head);

        return nodeCopy;
    }

    private void copyRandomPointers(Node head) {
        if(head == null) return;

        //Remember u have to create a copy
        //Not point to the reference
        NodeCopy nodeCopy = cloneNodeMap.get(head);
        Node oldRandomNode = head.random;
        NodeCopy newRandomNode = cloneNodeMap.get(oldRandomNode);
        nodeCopy.random = newRandomNode;

        copyRandomPointers(head.left);
        copyRandomPointers(head.right);
    }

    private NodeCopy deepCopy(Node root) {
        if(root == null) return null;

        NodeCopy copy = new NodeCopy(root.val);
        copy.left   = deepCopy(root.left);
        copy.right   = deepCopy(root.right);

        cloneNodeMap.put(root, copy);
        return copy;
    }
}
