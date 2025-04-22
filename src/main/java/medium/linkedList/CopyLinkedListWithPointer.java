package medium.linkedList;

import utils.Node;

import java.util.HashMap;
import java.util.Map;

public class CopyLinkedListWithPointer {
    public Node copyRandomList(Node head) {
        Map<Node, Node> oldToNewMap = new HashMap<>();
        Node curr = head;

        while(curr != null){
            oldToNewMap.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        curr = head;

        while(curr != null){
            Node copy = oldToNewMap.get(curr);
            copy.next = oldToNewMap.get(curr.next);
            copy.random = oldToNewMap.get(curr.random);
            curr = curr.next;
        }

        return oldToNewMap.get(head);
    }
}
