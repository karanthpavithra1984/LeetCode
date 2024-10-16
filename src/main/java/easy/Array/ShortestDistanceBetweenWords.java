package easy.Array;

public class ShortestDistanceBetweenWords {

    /**
     * Time Complexity o(n)
     * Space Complexity constant integer o(1)
     *
     */
    public int shortestDistance(String[] wordsDict, String word1, String word2) {

        int minDistance = wordsDict.length + 1 ;
        int firstMatch = -1;
        int secondMatch = -1;
        for(int i= 0 ; i< wordsDict.length; i++){
            if(wordsDict[i].equals(word1)){
                firstMatch = i;
            }

            if(wordsDict[i].equals(word2)){
                secondMatch = i;
            }

            if(firstMatch > -1 && secondMatch > -1)
                minDistance = Math.min(minDistance, Math.abs(firstMatch-secondMatch));
        }

        return minDistance == wordsDict.length + 1 ? 0 : minDistance;
    }

}
