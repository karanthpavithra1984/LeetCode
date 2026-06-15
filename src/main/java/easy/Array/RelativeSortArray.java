package easy.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int maxValue = Arrays.stream(arr1).max().orElse(0);

        int[] countArray = new int[maxValue + 1];

        for (int arr : arr1) {
            countArray[arr]++;
        }

        List<Integer> result = new ArrayList<>();
        for (int arr : arr2) {
            while (countArray[arr] > 0) {
                result.add(arr);
                countArray[arr]--;
            }
        }

        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                result.add(i);
                countArray[i]--;
            }
        }


        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}
