package medium.Array;

import java.util.Arrays;

public class TaskScheduler {
    /**
     * Time Complexity sorting 26log26 + n = o(n)
     * Space for charFreq which 26 which is constant
     *
     * @param tasks
     * @param n
     * @return
     */
    public int leastInterval(char[] tasks, int n) {
        int[] charFreq = new int[26];
        for (char c : tasks) {
            charFreq[c - 'A']++;
        }

        Arrays.sort(charFreq);

        // Substracting 1 , because the first character will be taken
        int maxFreq = charFreq[25] - 1;
        // considering we have already laid out the maxFreq items,
        // we need to have n space between them .
        // So idle Slots to be filled is maxFreq*n
        int idleSlots = maxFreq * n;

        for (int i = 24; i >= 0; i--) {
            // Consider the next item takes up 3 slots
            // minimum of maxFreq and charFreq and substract it from idleSlots
            if (charFreq[i] > 0)
                idleSlots -= Math.min(charFreq[i], maxFreq);
        }

        return idleSlots > 0 ? tasks.length + idleSlots : tasks.length;
    }
}
