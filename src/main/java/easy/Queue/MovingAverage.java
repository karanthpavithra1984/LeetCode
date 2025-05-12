package easy.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Time Complexity - o(1) - Since the queue has add/remove time complexity of o(1)
 * Space = o(n) where n is the size
 */
public class MovingAverage {
    Queue<Integer> queue;
    int size;
    int windowSum = 0;

    public MovingAverage(int size) {
        this.queue = new ArrayDeque<>(size);
        this.size = size;
    }

    public double next(int val) {
        this.queue.add(val);

        int tail = this.queue.size() > this.size ? this.queue.poll() : 0;

        windowSum += val - tail;
        return (windowSum * 1.0) / this.queue.size();
    }
}
