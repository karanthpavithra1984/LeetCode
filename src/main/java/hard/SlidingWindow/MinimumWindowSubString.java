package hard.SlidingWindow;

public class MinimumWindowSubString {
    public String minWindow(String s, String t) {
        int minLen = Integer.MAX_VALUE;
        int minStart = 0 , left = 0 , right = 0;
        int count = 0;
        int[] charCount = new int[128];

        for(char c: t.toCharArray()){
            charCount[c]++;
        }

        while(right < s.length()){
            if(charCount[s.charAt(right)]-- > 0){
                count++;
            }

            right++;

            while(left <= right && count == t.length()){
                int length = right - left;
                if(length < minLen){
                    minLen = Math.min(minLen, length);
                    minStart =left;
                }

                if(charCount[s.charAt(left)]++ == 0){
                    count--;
                }

                left++;
            }


        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minLen +  minStart);
    }
}
