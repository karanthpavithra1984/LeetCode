package medium.Array;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagIterator {
    Queue<Integer> queue = new LinkedList<>();

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        int v1Count = 0, v2Count = 0;
        while (v1Count < v1.size() && v2Count < v2.size()) {
            queue.add(v1.get(v1Count++));
            queue.add(v2.get(v2Count++));
        }

        while (v1Count < v1.size()) {
            queue.add(v1.get(v1Count++));
        }

        while (v2Count < v2.size()) {
            queue.add(v2.get(v2Count++));
        }
    }

    public int next() {
        return queue.poll();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
