package hard.SlidingWindow;

public class MinimumWindowSubString {
    public String minWindow(String s, String t) {
        int left = 0 , right = 0 , minLength = Integer.MAX_VALUE, minStart = 0;
        int[] charCount = new int[128];

        for(Character character: t.toCharArray()){
            charCount[character - 'A']++;
        }

        int count =0;
        while(right < s.length()){
            if(charCount[s.charAt(right)-'A'] > 0){
                count++;
            }

            charCount[s.charAt(right)-'A']--;

            while(left <= right && count == t.length()){
                int length = right-left + 1;
                if(length < minLength){
                    minLength = length;
                    minStart = left;
                }

                //slide and add the characters back
                if(charCount[s.charAt(left) - 'A'] == 0){
                    count--;
                }

                charCount[s.charAt(left) - 'A']--;

                left++;
            }
            right++;
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minLength+minStart);
    }

}
