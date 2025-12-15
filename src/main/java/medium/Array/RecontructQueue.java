package medium.Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class RecontructQueue {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }else  {
                return o2[0] - o1[0];
            }
        });

        List<int[]> list = new LinkedList<>();
       for(int[] people1 : people) {
           list.add(people1[1], people1);
       }

       return list.toArray(new int[list.size()][2]);
    }
}