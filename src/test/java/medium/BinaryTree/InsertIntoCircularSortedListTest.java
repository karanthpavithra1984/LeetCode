package medium.BinaryTree;

import org.junit.Test;
import utils.Node;

public class InsertIntoCircularSortedListTest {
    InsertIntoCircularSortedList insertIntoCircularSortedList = new InsertIntoCircularSortedList();

    @Test
    public void insertIntoCircularSortedList() {
        Node root = new Node(3);
        root.next = new Node(4);
        root.next.next = new Node(1);
        root.next.next.next = root;


        insertIntoCircularSortedList.insert(root, 2);

        Node root1 = new Node(1, new Node());

        insertIntoCircularSortedList.insert(root1, 0);
    }
}
