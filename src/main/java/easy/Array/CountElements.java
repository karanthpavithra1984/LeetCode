package easy.Array;

import java.util.HashSet;
import java.util.Set;

public class CountElements {
    public int countElements(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for(int a : arr){
            set.add(a);
        }
        int count = 0;
        for(int a: arr){
            if(set.contains(a + 1)){
               count++;
            }
        }

        return count;
    }
}
