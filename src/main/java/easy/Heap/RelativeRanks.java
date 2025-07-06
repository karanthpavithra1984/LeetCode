package easy.Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        Queue<int[]> queue = new PriorityQueue<>(Comparator.comparing(o -> -o[0]));

        for(int i=0; i < score.length; i++){
            queue.add(new int[]{score[i],i});
        }
        int top = 1;
        String[] prizes = new String[score.length];
        while(!queue.isEmpty()){
           int[] prize = queue.poll();
           String medal;
           switch (top){
               case 1 -> medal = "Gold Medal";
               case 2 -> medal = "Silver Medal";
               case 3 -> medal = "Bronze Medal";
               default -> medal = "" + (top);
           }
           prizes[prize[1]] = medal;
           top++;
        }

        return prizes;
    }
}
