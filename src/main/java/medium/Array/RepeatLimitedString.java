package medium.Array;

public class RepeatLimitedString {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        StringBuilder stringBuilder = new StringBuilder();
        //Start with the last
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) {
                continue;
            }

            int times = Math.min(freq[i], repeatLimit);
            stringBuilder.repeat((char) i + 'a', times);
            freq[i] -= times;

            //If it still has the values, go with the next best;
            if (freq[i] > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (freq[j] == 0) {
                        continue;
                    }

                    //just append one character
                    stringBuilder.append((char) (j + 'a'));
                    freq[j]--;
                    i++; //repeat with the i again as we want lexiographically larger
                    break;
                }
            }
        }

        return stringBuilder.toString();
    }
}
