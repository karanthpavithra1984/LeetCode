package hard.dp;

/**
 * Total time complexity o(n)
 * Space complexity o(26)
 */
public class TotalAppealOfAString {
    public long appealSum(String s) {
        int[] lastContribution = new int[26];

        int currentSum = 0;
        long  totalCount = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            currentSum+=(i+1-lastContribution[c - 'a']);
            // Its the contribution of a character at an index. If b is in 0 index, it will add 1, i.e 'b'.
            //If its in second index i.e 1, it will add 2 to the list of substrings, i.e b, ab
            lastContribution[c - 'a'] = i+1;
            totalCount += currentSum;
        }

        return totalCount;
    }
}
