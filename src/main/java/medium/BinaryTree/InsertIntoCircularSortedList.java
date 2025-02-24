package medium.BinaryTree;

import utils.Node;

/**
 * Time - o(n)
 * Space - o(1)
 */

public class InsertIntoCircularSortedList {
    public Node insert(Node head, int insertVal) {
        if(head == null){
            Node node = new Node(insertVal, null);
            node.next = node;
            return node;
        }

        Node prev = head;
        Node curr = head.next;

        do{
            if(prev.val <= insertVal && insertVal <= curr.val){
                insertNode(prev, curr, insertVal);
                return head;
            }else if(prev.val > curr.val ){
                if(insertVal >= prev.val || insertVal <= curr.val){
                    insertNode(prev, curr, insertVal);
                    return head;
                }
            }

            prev = curr;
            curr = curr.next;
        }while(prev != head);

        prev.next = new Node(insertVal, curr);

        return head;
    }


    private void insertNode(Node prev, Node current, int insertVal){
        prev.next = new Node(insertVal, current);
    }


}
