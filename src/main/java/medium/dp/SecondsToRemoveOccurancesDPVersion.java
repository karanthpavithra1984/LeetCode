package medium.dp;

public class SecondsToRemoveOccurancesDPVersion {
    public int secondsToRemoveOccurrences(String s) {
        int zeroes = 0, seconds = 0;

        for(int i = 0 ; i < s.length(); i++){
            zeroes += s.charAt(i) == '0' ? 1 : 0;
            if(s.charAt(i) == '1' && zeroes > 0){
                seconds = Math.max(seconds + 1, zeroes);
            }
        }

        return seconds;
    }
}
