package medium.Array;

import java.util.ArrayList;
import java.util.List;

public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
       List<Integer> list = new ArrayList<>();
       for(int i: nums){
           if(list.contains(i)){
               list.remove((Integer) i);
           }else {
               list.add(i);
           }
       }

       return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
