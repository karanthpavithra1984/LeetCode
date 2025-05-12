package medium.bfs;

import java.util.*;

/*Time Complexuity o(b*n^2)
Space complexity is mostly the size of the bank words i.e o(b)

 */

public class MinMutation {
    public int minMutation(String startGene, String endGene, String[] bank) {
        //Start with adding startGene to a queue
        Queue<String> queue = new LinkedList<>();
        queue.add(startGene);

        //Maintain a visited set.so that we dont add it to queue again
        Set<String> visited = new HashSet<>();
        visited.add(startGene);

        //O(1)
        List<String> bankList = Arrays.asList(bank);

        char[] chars = new char[]{'A', 'C', 'T', 'G'};

        int numOfMutations = 0;
        /**
         * Worst case queue will have all the bank Items so o(b)
         */
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String gene = queue.poll();
                if (gene.equals(endGene)) {
                    return numOfMutations;
                }

                /**
                 * Chars is 4, so constant time
                 * Gene Length * string operation over gene length - o(n ^ 2)
                 */
                for (char c : chars) {
                    for (int j = 0; j < gene.length(); j++) {
                        String neighbor = gene.substring(0, j) + c + gene.substring(j + 1);
                        if (!visited.contains(neighbor) && bankList.contains(neighbor)) {
                            queue.add(neighbor);
                            visited.add(neighbor);
                        }
                    }
                }
            }
            numOfMutations++;
        }

        return -1;
    }
}
