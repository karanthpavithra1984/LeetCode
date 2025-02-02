package hard.bfs;

import java.util.*;

public class WordLadderII {
    public List<List<String>> findLadders(String beginWord,
                                          String endWord,
                                          List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        if (!wordList.contains(endWord)) {
            return result;
        }
        /**When searching for a specific word,
         * using a set is significantly faster than a
         * list because sets are optimized for membership checks,
         * meaning you can quickly determine if a word exists within the
         * set with a near-constant time complexity (O(1)),
         * while searching in a list has a linear time complexity (O(n)), which can become slow with large datasets.
         *
         */

        //Time Complexity o(n)
        Set<String> wordSet = new HashSet<>(wordList);

        //Add to a queue and visitied
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        int step = 1;

        /**
         * Queue at the max will have wordList items
         * and 26 characters looping through word length  n and creating a string from chars N
         * so total o(b*26*n^2)
         *
         */
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                //  if (word.equals(endWord)) {
//return result;
                //  }

                for (char ch = 'a'; ch <= 'z'; ch++) {
                    for (int j = 0; j < word.length(); j++) {
                        char[] charArray = word.toCharArray();
                        charArray[j] = ch;
                        String alteredWord = new String(charArray);
                        if (!visited.contains(alteredWord) && wordSet.contains(alteredWord)) {
                            queue.add(alteredWord);
                            visited.add(alteredWord);
                        }
                    }
                }
            }
            step++;
        }
        return new ArrayList<>();
    }
}
