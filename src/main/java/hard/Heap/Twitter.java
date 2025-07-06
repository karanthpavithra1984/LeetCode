package hard.Heap;

import java.util.*;

public class Twitter {
    private int count;
    private final Map<Integer, List<int[]>> tweetMap;
    private final Map<Integer, Set<Integer>> followerMap;

    public Twitter() {
        count = 0;
        tweetMap = new HashMap<>();
        followerMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        if (!tweetMap.containsKey(userId)) {
            tweetMap.put(userId, new ArrayList<>());
        }

        tweetMap.get(userId).add(new int[]{count++, tweetId});
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> -a[0]));

        if (followerMap.isEmpty()) {
            followerMap.put(userId, new HashSet<>());
        }
        followerMap.get(userId).add(userId);

        //Get all the followers of the userId
        for (int followee : followerMap.get(userId)) {
            if (tweetMap.containsKey(followee)) {
                int index = tweetMap.get(followee).size() - 1;
                //Last index
                int[] tweetInfo = tweetMap.get(followee).get(index);
                minHeap.offer(new int[]{tweetInfo[0], tweetInfo[1], followee, index});
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!minHeap.isEmpty() && result.size() < 10) {
            int[] latest = minHeap.poll();
            result.add(latest[1]);
            //Get the next i.e previous to the last of the folowwe and add to the heap
            int index = latest[3];
            if (index > 0) {
                int[] tweetInfo = tweetMap.get(latest[2]).get(index - 1);
                minHeap.offer(new int[]{tweetInfo[0], tweetInfo[1], latest[2], index - 1});
            }
        }
        return result;
    }

    public void follow(int followerId, int followeeId) {
        if (!followerMap.containsKey(followerId)) {
            followerMap.put(followerId, new HashSet<>());
        }

        followerMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followerMap.containsKey(followerId)) {
            followerMap.get(followerId).remove(followeeId);
        }
    }
}
