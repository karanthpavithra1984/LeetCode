package medium.twopointers;

import java.util.Arrays;

public class SuccessFulPairs {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] answer = new int[spells.length];

        int[][] sortedSpells = new int[spells.length][2];
        for (int i = 0; i < spells.length; i++) {
            //Save the index and spell
            sortedSpells[i][0] = spells[i];
            sortedSpells[i][1] = i;
        }

        Arrays.sort(potions);
        Arrays.sort(sortedSpells, (a, b) -> Integer.compare(a[0], b[0]));

        int portionIndex = potions.length - 1;
        for (int i = 0; i < sortedSpells.length; i++) {
            int value = sortedSpells[i][0];
            int index = sortedSpells[i][1];
            while (portionIndex >= 0 && (long) value * potions[portionIndex] >= success) {
                portionIndex -= 1;
            }

            answer[index] = potions.length - (portionIndex + 1);
        }

        return answer;
    }
}
