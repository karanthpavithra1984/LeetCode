package easy.Array;

import java.util.Arrays;
import java.util.List;

public class TransformArray {
    public List<Integer> transformArray(int[] arr) {
        boolean changed = true;

        while (changed) {
            changed = false;

            int prev = arr[0], current = 0;
            for (int i = 1; i < arr.length - 1; i++) {
                current = arr[i];

                if (current > prev && current > arr[i + 1]) {
                    arr[i]--;
                    changed = true;
                } else if (current < prev && current < arr[i + 1]) {
                    arr[i]++;
                    changed = true;
                }

                prev = current;
            }
        }

        return Arrays.stream(arr).boxed().toList();
    }
}
