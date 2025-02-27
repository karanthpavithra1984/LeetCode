package medium.twopointers;

import java.util.Arrays;

public class MinMeetingRooms {
    //Time is o(nlogn + nlogn + n)
    //Sort has o(logn) so 2logn
    public int minMeetingRooms(int[][] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];

        for(int i = 0; i < intervals.length; i++){
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }

        //Sort start and end
        Arrays.sort(starts);
        Arrays.sort(ends);

        int numOfRooms = 0;

        int startIndex = 0;
        int endIndex = 0;
        while(startIndex < starts.length && endIndex < ends.length){
            if(starts[startIndex] >= ends[endIndex]){
                numOfRooms--;
                endIndex++;
            }

                numOfRooms++;
                startIndex++;

        }

        return numOfRooms;
    }
}
