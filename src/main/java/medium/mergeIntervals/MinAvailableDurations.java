package medium.mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAvailableDurations {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(slots2, Comparator.comparingInt(a -> a[0]));

        int pointer1 = 0, pointer2 = 0;

        while (pointer1 < slots1.length && pointer2 < slots2.length) {
            int[] slot1 = slots1[pointer1];
            int[] slot2 = slots2[pointer2];
            int intersectLeft = Math.max(slot1[0], slot2[0]);
            int intersectRight = Math.min(slot1[1], slot2[1]);
            if (intersectRight - intersectLeft >= duration) {
                return new ArrayList<>(Arrays.asList(intersectLeft, intersectLeft + duration));
            }

            if (slot1[1] < slot2[1]) {
                pointer1++;
            } else {
                pointer2++;
            }
        }

        return new ArrayList<>();
    }
}
