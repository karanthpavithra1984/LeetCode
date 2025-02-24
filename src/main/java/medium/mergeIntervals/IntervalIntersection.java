package medium.mergeIntervals;

import java.util.ArrayList;
import java.util.List;

/**
 * Time Complexity o(Min(length of firstList , length of secondList))
 * Since its intersection
 */


public class IntervalIntersection {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if(firstList.length == 0 || secondList.length == 0){
           return new int[0][];
       }

        List<int[]> result = new ArrayList<>();

        int firstLength = firstList.length;
        int secondLength = secondList.length;

        int firstIndex = 0;
        int secondIndex = 0;

        while(firstIndex < firstLength && secondIndex < secondLength){

            int minValue = Math.max(firstList[firstIndex][0], secondList[secondIndex][0]);
            int maxValue = Math.min(firstList[firstIndex][1], secondList[secondIndex][1]);


            if(minValue <= maxValue) {
                result.add(new int[]{minValue, maxValue});
            }

            if(firstList[firstIndex][1] <= secondList[secondIndex][1]){
                firstIndex++;
            }else{
                secondIndex++;
            }
        }

        return result.toArray(new int[result.size()][]);

    }
}
