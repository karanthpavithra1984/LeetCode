package medium.Array;

import java.util.ArrayList;
import java.util.List;

public class ConvertInto2DArray {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] freq = new int[nums.length + 1];

        List<List<Integer>> answerArray = new ArrayList<>();

        for (int num : nums) {
            //More than 1 - Hence need a new array
            //If 0 , initialize
            if (freq[num] >= answerArray.size()) {
                answerArray.add(new ArrayList<>());
            }

            answerArray.get(freq[num]).add(num);
            freq[num]++;
        }

        return answerArray;
    }
}
