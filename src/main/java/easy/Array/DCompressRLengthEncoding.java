package easy.Array;

import java.util.ArrayList;
import java.util.List;

public class DCompressRLengthEncoding {
    public int[] decompressRLEList(int[] nums) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int value = nums[i + 1];

            while (freq > 0) {
                array.add(value);
                freq--;
            }
        }

        return array.stream().mapToInt(i -> i).toArray();
    }
}
