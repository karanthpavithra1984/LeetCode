package medium.hashTable;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    int capacity;
    Map<Integer, DoubleLinkedList> cacheMap;
    DoubleLinkedList head;
    DoubleLinkedList tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cacheMap = new HashMap<>();
        this.head = new DoubleLinkedList(-1,-1);
        this.tail = new DoubleLinkedList(-1,-1);

        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    public int get(int key) {
        if(!cacheMap.containsKey(key)){
            return -1;
        }

        //Remove value and add to the tail
        DoubleLinkedList node = cacheMap.get(key);
        remove(node);
        addToTail(node);
        return node.value;
    }

    public void put(int key, int value) {
        if(cacheMap.containsKey(key)){
           remove(cacheMap.get(key));
        }

        DoubleLinkedList addedLL = new DoubleLinkedList(key, value);
        addToTail(addedLL);
        cacheMap.put(key, addedLL);

        if(this.cacheMap.size() > this.capacity){
            DoubleLinkedList nodeToDelete = this.head.next;
            remove(nodeToDelete);
            cacheMap.remove(nodeToDelete.key);
        }
    }

    private void remove(DoubleLinkedList node){
        DoubleLinkedList previous = node.prev;
        DoubleLinkedList next = node.next;
        previous.next = next;
        next.prev = previous;
    }

    private void addToTail(DoubleLinkedList node){
        DoubleLinkedList tailNode = this.tail.prev;

        tailNode.next = node;
        node.prev = tailNode;
        node.next = this.tail;
        this.tail.prev = node;
    }

}

class DoubleLinkedList{
    int key;
    int value;
    DoubleLinkedList next;
    DoubleLinkedList prev;

    DoubleLinkedList(int key , int value){
        this.key = key;
        this.value = value;
    }
}