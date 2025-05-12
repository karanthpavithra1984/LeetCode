package easy.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        //Sort the Array
        Arrays.sort(arr);
        int minDifference = Integer.MAX_VALUE;
        List<List<Integer>> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            int currDifference = arr[i + 1] - arr[i];

            if (currDifference == minDifference) {
                arrList.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (currDifference < minDifference) {
                //New minDifference
                arrList.clear();
                arrList.add(Arrays.asList(arr[i], arr[i + 1]));
                minDifference = currDifference;
            }
        }

        return arrList;
    }
}
