package medium.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Leaderboard {
    Map<Integer, Integer> scores;

    public Leaderboard() {
        scores = new HashMap<>();
    }

    public void addScore(int playerId, int score) {
        scores.put(playerId, scores.getOrDefault(playerId, 0) + score);
    }

    public int top(int K) {
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
                (o1, o2) -> o1.getValue() - o2.getValue());

        for (Map.Entry<Integer, Integer> entry : scores.entrySet()) {
            queue.add(entry);
            if (queue.size() > K) {
                queue.poll();
            }
        }

        int total = 0;

        for (Map.Entry<Integer, Integer> entry : queue) {
            total += entry.getValue();
        }

        return total;
    }

    public void reset(int playerId) {
        scores.remove(playerId);
    }
}

