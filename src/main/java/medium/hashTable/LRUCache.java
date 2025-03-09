package medium.hashTable;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity;
    Map<Integer, DLListNode> cacheMap;
    DLListNode head;
    DLListNode tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.head = new DLListNode(-1, -1);
        this.tail = new DLListNode(-1, -1);
        this.head.next = this.tail;
        this.tail.prev = this.head; //Remember this


        this.cacheMap = new HashMap<>();

    }

    public int get(int key) {
        if (!cacheMap.containsKey(key)) {
            return -1;
        }

        DLListNode listNode = cacheMap.get(key);
        //Remove
        remove(listNode);
        //Add to the tail , to make it more recent
        add(listNode);
        return listNode.val;
    }

    public void put(int key, int value) {
        if (cacheMap.containsKey(key)) {
            remove(cacheMap.get(key));
        }

        DLListNode listNode = new DLListNode(key, value);
        add(listNode);
        cacheMap.put(key, listNode);

        if (cacheMap.size() > this.capacity) {
            DLListNode nodeToDelete = head.next;
            remove(nodeToDelete);
            cacheMap.remove(nodeToDelete.key);
        }
    }

    private void remove(DLListNode listNode) {
        DLListNode prevNode = listNode.prev;
        DLListNode nextNode = listNode.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    private void add(DLListNode listNode) {
        DLListNode insertAtNode = tail.prev;
        insertAtNode.next = listNode;
        listNode.prev = insertAtNode;
        listNode.next = tail;
        tail.prev = listNode;

    }
}

class DLListNode {
    int key;
    int val;
    DLListNode next;
    DLListNode prev;

    public DLListNode(int key, int val) {
        this.key = key;
        this.val = val;
    }
}
