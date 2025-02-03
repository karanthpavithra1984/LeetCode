package hard.dp;

public class UniqueLetterString {

    public int uniqueLetterString(String s) {
        int[] lastContribution = new int[26];
        int[] contributionOfAChar = new int[26];

        int currentSum = 0;
        int totalCount = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            //If there is a value here , that means there is a duplicate, hence we need to negate the contribution only.
            //For example if a B is added to "ABC" , Considering B was already present, it will create duplicates, BCB & ABCB
            // and negate the previous sum by 2 because BCB is now 1 and ABCB is now 2 unique characters
            currentSum-=contributionOfAChar[c - 'A'];
           //Update the contribution to include lastContribution
            contributionOfAChar[c - 'A'] = (i + 1 - lastContribution[c-'A']);
            //Add the new contribution , since we need to make sure the new
            currentSum+=contributionOfAChar[c - 'A'];
            // adding a character at an Index will increase the contribution by index+1;
            lastContribution[c - 'A'] = i+1;
            totalCount += currentSum;
        }

        return totalCount;
    }

}
