package medium.slidingWindow;

public class EqualSubString {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0, maxLength = 0, currentCost = 0;

        for(int i = 0; i < s.length(); i++) {
            currentCost += Math.abs(s.charAt(i) - t.charAt(i));

            while(currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(start) - t.charAt(start));
                start++;
            }

            maxLength = Math.max(i-start+1, maxLength);
        }

        return maxLength;
    }
}
