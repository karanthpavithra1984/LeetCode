package medium.dp;

public class LongestCommonSubSequenceOptimal {
    /**
     * Time Complexity o(n2)
     *
     * @param text1
     * @param text2
     * @return
     */
    public int longestCommonSubsequence(String text1, String text2) {
        //One extra because we are doing bottom up approach
        int[] prevRow = new int[text2.length()+1];
        for(int row = text1.length()-1; row>=0 ;row--){
            int[] curRow = new int[text2.length()+1];
            for(int col = text2.length()-1; col>=0;col--){
                if (text1.charAt(row) == text2.charAt(col)) {
                    curRow[col] = 1+ prevRow[col+1];
                }else{
                    curRow[col] = Math.max(curRow[col+1], prevRow[col]);
                }
            }
            prevRow = curRow;
        }

        return prevRow[0];
    }
}
