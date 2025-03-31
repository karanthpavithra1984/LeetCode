package medium.Array;

import java.util.Arrays;

public class MinimumIncrementForUnique {
    public int minIncrementForUnique(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();

        int[] frequencyMap = new int[nums.length + max];
        int minimumExtra = 0;

        for(int num: nums){
            frequencyMap[num]++;
        }

        for(int i=0;i < frequencyMap.length ; i++){
            //Already unique
            if(frequencyMap[i] <= 1){
                continue;
            }

            //Make sure you keep 1
            int extra = frequencyMap[i] - 1;
            //Move to next one
            frequencyMap[i+1] += extra;
            frequencyMap[i] = 1;
            minimumExtra += extra;
        }


        return minimumExtra;
    }
}
