package medium.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsWithInTwoEditsOfDictionary {

    /**
     * Time Complexity o(n*m)
     * Space Complexity o(1) if you dont consider the result list string
     *
     * @param queries
     * @param dictionary
     * @return
     */
    public List<String> twoEditWords(String[] queries, String[] dictionary) {

        //Time Complexity o(1)
        List<String> dictionaryList = Arrays.asList(dictionary);
        List<String> result = new ArrayList<>();

        /**
         * Time Complexity if all the queries match a dictionary , then wost case o(n*m*100)
         * n-> n length queries
         * m-> length of dictionaryList
         * 100 length of word.
         */
        for (String query : queries) {
            for (String dictionaryWord : dictionaryList) {
                if (numberOfDifferences(query, dictionaryWord)) {
                    result.add(query);
                    break;
                }
            }
        }

        return result;
    }

    private boolean numberOfDifferences(String query, String dictionaryWord) {
        int differences = 0;
        for (int i = 0; i < query.length(); i++) {
            if (dictionaryWord.charAt(i) != query.charAt(i)) {
                differences++;
            }
            //Break if its more than 2 and return -1
            if (differences > 2)
                return false;
        }

        return true;
    }
}
