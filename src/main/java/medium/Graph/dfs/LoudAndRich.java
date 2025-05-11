package medium.Graph.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoudAndRich {
    int[] answer;

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < quiet.length; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] i : richer) {
            adjList.get(i[1]).add(i[0]);
        }

        answer = new int[quiet.length];
        Arrays.fill(answer, -1);

        for (int i = 0; i < quiet.length; i++) {
            dfs(adjList, i, quiet);
        }

        return answer;
    }

    private int dfs(List<List<Integer>> adjList, int node, int[] quiet) {
        if (answer[node] == -1) {
            answer[node] = node;
            for (int neighbor : adjList.get(node)) {
                int lastCand = dfs(adjList, neighbor, quiet);
                if (quiet[lastCand] < quiet[answer[node]]) {
                    answer[node] = lastCand;
                }
            }
        }

        return answer[node];
    }
}
